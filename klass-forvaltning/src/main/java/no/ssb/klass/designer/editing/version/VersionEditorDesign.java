package no.ssb.klass.designer.editing.version;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.DateField;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

/** 
 * !! DO NOT EDIT THIS FILE !!
 * 
 * This class is generated by Vaadin Designer and will be overwritten.
 * 
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class VersionEditorDesign extends VerticalLayout {
    protected Label headerLabel;
    protected VerticalLayout bokmalLayout;
    protected Label primaryLabel;
    protected HorizontalLayout intervalPanel;
    protected VerticalLayout primary;
    protected Label fromLabel;
    protected DateField fromDate;
    protected DateField toDate;
    protected TextField alias;
    protected TextArea introduction;
    protected TextField legalBase;
    protected TextField publications;
    protected TextField derivedFrom;
    protected ComboBox contactPersonCombobox;
    protected TextField sectionTextfield;
    protected VerticalLayout otherLanguages;
    protected HorizontalLayout languagesHeader;
    protected HorizontalLayout languageLayout;
    protected Button secondaryLanguageButton;
    protected Button thirdLanguageButton;
    protected Button languageToggleButton;
    protected VerticalLayout secondaryLanguageLayout;
    protected TextField secondaryAlias;
    protected TextArea secondaryIntroduction;
    protected TextField secondaryLegalBase;
    protected TextField secondaryPublications;
    protected TextField secondaryDerivedFrom;
    protected VerticalLayout thirdLanguageLayout;
    protected TextField thirdAlias;
    protected TextArea thirdIntroduction;
    protected TextField thirdLegalBase;
    protected TextField thirdPublications;
    protected TextField thirdDerivedFrom;

    public VersionEditorDesign() {
        Design.read(this);
    }
}
