package no.ssb.klass.designer.windows;

import no.ssb.klass.designer.components.common.ConfirmOrCancelComponent;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Label;
import com.vaadin.ui.ProgressBar;
import com.vaadin.ui.Upload;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

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
public class UploadFileWindowDesign extends VerticalLayout {
    protected Label titleLabel;
    protected Upload uploadComponent;
    protected ProgressBar progressbar;
    protected ConfirmOrCancelComponent actionButtons;

    public UploadFileWindowDesign() {
        Design.read(this);
    }
}
