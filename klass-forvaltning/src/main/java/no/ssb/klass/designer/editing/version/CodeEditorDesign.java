package no.ssb.klass.designer.editing.version;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

import no.ssb.klass.designer.editing.codetables.PrimaryCodeTableFilterWrapper;
import no.ssb.klass.designer.editing.codetables.TranslationCodeTableFilterWrapper;
import no.ssb.klass.designer.editing.codetables.levels.PrimaryLevelsComponent;
import no.ssb.klass.designer.editing.codetables.levels.TranslationLevelsComponent;
import no.ssb.klass.designer.editing.components.EditLanguagesComponent;

/**
 * !! DO NOT EDIT THIS FILE !!
 * 
 * This class is generated by Vaadin Designer and will be overwritten.
 * 
 * Please make a subclass with logic and additional interfaces as needed, e.g class LoginView extends LoginDesign
 * implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class CodeEditorDesign extends VerticalLayout {
    protected Button importButton;
    protected Button exportButton;
    protected Label primaryLanguage;
    protected EditLanguagesComponent editTranslations;
    protected PrimaryLevelsComponent primaryLevels;
    protected TranslationLevelsComponent translationLevels;
    protected PrimaryCodeTableFilterWrapper primaryCodeTable;
    protected TranslationCodeTableFilterWrapper translationCodeTable;

    public CodeEditorDesign() {
        Design.read(this);
    }
}
