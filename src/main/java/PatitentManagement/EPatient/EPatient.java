package PatitentManagement.EPatient;

import java.util.ArrayList;

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

    }

}