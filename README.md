# TDT4250-project

## Description
In this project we have created a viewer and editor for [Arbeidstilsynets Bedriftshelsetjenestegodkjenningsregister](https://www.arbeidstilsynet.no/opendata/bht.xml). 

To do this we have modeled the data, first as a model that adheres to the structure in the supplied data, which we then modified to work better as a model for our use-case, as the original model had some limitations because of its origin as an XML-file. The main modification we made was making a top level entity we called UoD that contains lists of Bedriftshelsetjeneste and Fylke objects, where the Fylke objects each contain a list of Kommune objects. The Bedriftshelsetjeneste objects will have references to the Kommune and the Kommune to the Fylke objects in the list, instead of each Bedriftshelsetjeneste having a copy of all the data.

As the data was supplied as an XML-file without an XSD file, so we were not able to read it directly into ECore, and instead used Jackson to read the data into custom POJOs that were made to fit the model, and then performed a Model-to-Model Transformation to the ECore model we created.

TODO: more stuff

## How to use
---
1. Clone the repository using: git clone https://github.com/leevi978/TDT4250-project.git
2. Create a blank workspace in eclipse
3. Click 'file', 'Open projects from File System...', 'Import source:', 'Directory...'
4. Import the following folders:
    * bht
    * org.example.bedrifthelsetjenesten.design
    * org.example.bedrifthelsetjenesten.sample
5. Navigate into bht -> src-gen -> main. Right-click MainProgram.java, 'Run As', 'Java Application' *
6. Click the 'org.example.bedrifthelsetjenesten.sample' folder and press F5 to refresh
7. Right click 'My.bht', 'new', 'other...', 'Representations File'. Select 'Initalization from a semantic resource' and 'Finish'. Check the 'UoD' box and press 'OK'
8. Open my.aird, right-click 'UoD' under the 'Models' tab, 'New representation', 'new UoD diagram'

#### * Unrecognized field
If you get an error like 
```
Unrecognized field "Søknadsdato"
```
that most likely means Eclipse is trying to parse an UTF-8 coded file as something else (probably ASCII). 
If you open bht -> src-gen -> xmlparser -> Godkjenningstatus.java, on line 11 it should say 
```java
@JsonProperty("Søknadsdato")
``` 
which is what it says [on github](https://github.com/leevi978/TDT4250-project/blob/master/bht/src-gen/xmlparser/Godkjenningsstatus.java#L11), so if it does not say that when you open the file in Eclipse, just change the text to say "Søknadsdato" and it should work.
