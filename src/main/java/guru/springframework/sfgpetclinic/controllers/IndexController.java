package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.exception.ValueNoteFoundException;

public class IndexController {

    public String index(){

        return "index";
    }

    public String oupsHandler(){
         throw new ValueNoteFoundException();
    }
}
