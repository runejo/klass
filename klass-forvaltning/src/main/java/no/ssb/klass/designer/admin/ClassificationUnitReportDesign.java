package no.ssb.klass.designer.admin;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Table;
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
public class ClassificationUnitReportDesign extends VerticalLayout {
    protected Button backButton;
    protected Label headingText;
    protected Label numberOfRowsHeader;
    protected VerticalLayout detailedUseLayout;
    protected Label sectionHeader;
    protected Table detailedUseReport;
    protected HorizontalLayout pagingButtons;

    public ClassificationUnitReportDesign() {
        Design.read(this);
    }
}
