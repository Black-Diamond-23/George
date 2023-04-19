package PatitentManagement.EPatient;

import java.util.ArrayList;
import java.util.Arrays;

public class EPatient {
    // Members
    // Store the information or pointers to information that is needed for answering questions.
    int menuIdx = 0;

    MenuEntry currentMenu;

    MenuEntry welcomeMenu;
    MenuEntry emergencyMenu;
 
    // Methods
    // Design methods for answering a patient's question.

    // Constructor
    // public EPatient(){

    

    public void startConverstation(){
        
        currentMenu.printPromptAndOptions();
    }

    private void initMenu(){
        welcomeMenu = new MenuEntry();
        welcomeMenu.promptSetter("Hello, is this an emergency situation?");
        welcomeMenu.optionsSetter(new ArrayList<String>(Arrays.asList("Yes, this is emergency!", "No, I'm fine.")));

        emergencyMenu = new MenuEntry();
        emergencyMenu.promptSetter("Ok, please call 911. Ending EPatient conversation. ");

        MenuEntry normalMenu = new MenuEntry();
        normalMenu.promptSetter("OK. I'm happy to help you but I haven't been inplemented.");
        normalMenu.optionsSetter(new ArrayList<String>(Arrays.asList("Go back to main menu.")));
        normalMenu.jumpToSetter(new ArrayList<MenuEntry>(Arrays.asList(welcomeMenu)));

        welcomeMenu.jumpToSetter(new ArrayList<MenuEntry>(Arrays.asList(emergencyMenu, normalMenu)));

        currentMenu = welcomeMenu;
    }

}