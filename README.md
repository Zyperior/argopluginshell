Add dependencies if neccessary(See picture for details):
Project-structure - Modules - Choose the pluginmodule - Dependecies-tab - + Add Module Dependency - Pick the main-application in the list.

Creating the JAR(See pictures for details):
Project Structure - Artifacts - + JAR - From module with dependencies - Choose the module you want to jar - OK
Change the Outputdirectory to the mainapplication/Plugins folder. (Place the jar-file directly in this folder - No subfolders).
In the Output Layout tab - Remove the mainapplication compile output (You only want the compile output for the pluginmodule).

To build the JAR:
Build - Build Artifacts.. - Choose your artifact (Redo this every time you change something in the plugin in order for the change to take effect when accessing the jar from the serviceloader).
