package PatitentManagement.EPatient;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.Console;

public class MenuEntry {
    String prompt;
    // 1. Call doctor; 2. I'm fine.
    ArrayList<String> options;
    ArrayList<MenuEntry> jumpTo;

    public MenuEntry(){
    }

    public void promptSetter(String p){
        prompt = p;
    }

    public void optionsSetter(ArrayList<String> opts){
        options = opts;
    }

    public void jumpToSetter(ArrayList<MenuEntry> jts){
        jumpTo = jts;
    }

    public void printPromptAndOptions(){
        System.out.println(prompt);
        if(options == null) return;
        for(int i = 0; i < options.size(); i++){
            System.out.println("#" + i + ": " + options.get(i));
        }
    }

    public MenuEntry select(){
        if(jumpTo == null) return null;
        System.out.println("Select the option you want: ");
        Scanner s = new Scanner(System.in);
        int i = Integer.parseInt(s.nextLine());
        if(i > jumpTo.size()) return null;
        return jumpTo.get(i);
    }
}