# TDT4250-project

## Description
In this project we have created a viewer and editor for [Arbeidstilsynets Bedriftshelsetjenestegodkjenningsregister](https://www.arbeidstilsynet.no/opendata/bht.xml). 

To do this we have modeled the data, first as a model that adheres to the structure in the supplied data, which we then modified to work better as a model for our use-case, as the original model had some limitations because of its origin as an XML-file. The main modification we made was making a top level entity we called UoD that contains lists of Bedriftshelsetjeneste and Fylke objects, where the Fylke objects each contain a list of Kommune objects. The Bedriftshelsetjeneste objects will have references to the Kommune and the Kommune to the Fylke objects in the list, instead of each Bedriftshelsetjeneste having a copy of all the data.

As the data was supplied as an XML-file without an XSD file, so we were not able to read it directly into ECore, and instead used Jackson to read the data into custom POJOs that were made to fit the model, and then performed a Model-to-Model Transformation to the ECore model we created.

The viewer and editor was made with Sirius, and gives a graphical view of all the data, with the ability to edit fields. The idea for the view was that the Fylke objects would be on the left side, with Kommune objects that are a part of the Fylke bordering them on the right side, and the Postadresse objects bordering the Kommune objects, with an arrow from each Bedriftshelsetjeneste to the corresponding Postadresse. Fields can be edited by double clicking, and Godkjenningsstatus can be changed between 'Godkjent' and 'Ikke godkjent' by double clicking Godkjenningsstatus representation. This idea was implemented, and with some test data looked like this:
![Test data view](https://imgur.com/V1HVTzm.png)

The test data view was made with the help of some manual adjustment of the elements view, which we hoped we would be able to replicate as a part of the design file, but we weren't able to. We tried some different ways of organizing the elements, and looked into ELK, but we were not able to create a design that resembled the original idea, and we decided to create a simpler organization instead.

Immediately when we imported the full dataset we saw that the lines between Postadresse and Bedriftshelsetjeneste objects could create some problems 
![Too many lines view](https://imgur.com/Z4ETPaT.png) 
We decided to scrap the lines, which unfortunately removed quite a bit of information from the view, but we didn't see any other options unless we had a way to create the organization we wanted.

We added filters for each of the Fylke objects, so you can see just the data from that Fylke, which makes the view more managable, especially for the smaller Fylke objects. Here is an example showing the Fylke and the first few Bedriftshelsetjeneste objects from Vest-Agder:

![Vest-Agder view](https://imgur.com/U4CjQ3H.png)

## How to use
1. Clone the repository using: git clone https://github.com/leevi978/TDT4250-project.git
2. Create a blank workspace in eclipse
3. Click 'file', 'Open projects from File System...', 'Import source:', 'Directory...'
4. Import the following folders:
    * bht
    * org.example.bedrifthelsetjenesten.design
    * org.example.bedrifthelsetjenesten.sample
5. Navigate into bht -> src-gen -> main. Right-click MainProgram.java, 'Run As', 'Java Application' [1]
6. Click the 'org.example.bedrifthelsetjenesten.sample' folder and press F5 to refresh
7. Right click 'My.bht', 'new', 'other...', 'Representations File'. Select 'Initalization from a semantic resource' and 'Finish'. Check the 'UoD' box and press 'OK' [2]
8. Open my.aird, right-click 'UoD' under the 'Models' tab, 'New representation', 'new UoD diagram'

In order to see just data for one Fylke you can click the Filter button and select which Fylke you want to see the data from

![Filter button](https://imgur.com/nPSjWOl.png)

Once it has loaded, right click the background and click Layout -> Arrange All to clean up the layout.
If you want to change filter, remember to uncheck the previous filter, otherwise it will look for elements that are in both the selected Fylke objects, which will be none.

### Troubleshooting

#### [1] Unrecognized field
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

#### [2] "New representation file" wizard does not complete properly
If the wizard for adding a new representation file doesn't fully complete and doesn't open the window where you can check the 'UoD' box, you might have to install the 'Ecore Diagram Editor (SDK)' package. Click Help -> Install new software... select --All Available Sites-- and search for the package, select it and click finish and follow the instructions. You might have to delete the incomplete represenations file (default name 'My.aird'), which will give you some warnings, but you can safely ignore them and delete the file.
