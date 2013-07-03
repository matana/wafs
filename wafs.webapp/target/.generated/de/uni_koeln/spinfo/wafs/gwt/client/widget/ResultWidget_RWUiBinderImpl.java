package de.uni_koeln.spinfo.wafs.gwt.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeUri;
import com.google.gwt.safehtml.shared.UriUtils;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class ResultWidget_RWUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, de.uni_koeln.spinfo.wafs.gwt.client.widget.ResultWidget>, de.uni_koeln.spinfo.wafs.gwt.client.widget.ResultWidget.RWUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span> <span id='{1}'></span>")
    SafeHtml html1(String arg0, String arg1);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final de.uni_koeln.spinfo.wafs.gwt.client.widget.ResultWidget owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final de.uni_koeln.spinfo.wafs.gwt.client.widget.ResultWidget owner;


    final com.google.gwt.event.dom.client.KeyUpHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.KeyUpHandler() {
      public void onKeyUp(com.google.gwt.event.dom.client.KeyUpEvent event) {
        owner.onKeyUp(event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onClick(event);
      }
    };

    public Widgets(final de.uni_koeln.spinfo.wafs.gwt.client.widget.ResultWidget owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0(), get_domId1());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private de.uni_koeln.spinfo.wafs.gwt.client.widget.ResultWidget_RWUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private de.uni_koeln.spinfo.wafs.gwt.client.widget.ResultWidget_RWUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final de.uni_koeln.spinfo.wafs.gwt.client.widget.ResultWidget_RWUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (de.uni_koeln.spinfo.wafs.gwt.client.widget.ResultWidget_RWUiBinderImpl_GenBundle) GWT.create(de.uni_koeln.spinfo.wafs.gwt.client.widget.ResultWidget_RWUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 1 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private de.uni_koeln.spinfo.wafs.gwt.client.widget.ResultWidget_RWUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private de.uni_koeln.spinfo.wafs.gwt.client.widget.ResultWidget_RWUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final de.uni_koeln.spinfo.wafs.gwt.client.widget.ResultWidget_RWUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      return style;
    }

    /**
     * Getter for f_HTMLPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel1() {
      return build_f_HTMLPanel1();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();
      get_domId1Element().get();

      // Detach section.
      attachRecord0.detach();
      f_HTMLPanel1.addAndReplaceElement(get_form(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_panel(), get_domId1Element().get());

      return f_HTMLPanel1;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId0;
    private java.lang.String get_domId0() {
      return domId0;
    }
    private java.lang.String build_domId0() {
      // Creation section.
      domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId0;
    }

    /**
     * Getter for form called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.github.gwtbootstrap.client.ui.Form get_form() {
      return build_form();
    }
    private com.github.gwtbootstrap.client.ui.Form build_form() {
      // Creation section.
      final com.github.gwtbootstrap.client.ui.Form form = (com.github.gwtbootstrap.client.ui.Form) GWT.create(com.github.gwtbootstrap.client.ui.Form.class);
      // Setup section.
      form.add(get_searchField());
      form.add(get_submitButton());


      owner.form = form;

      return form;
    }

    /**
     * Getter for searchField called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.github.gwtbootstrap.client.ui.TextBox get_searchField() {
      return build_searchField();
    }
    private com.github.gwtbootstrap.client.ui.TextBox build_searchField() {
      // Creation section.
      final com.github.gwtbootstrap.client.ui.TextBox searchField = (com.github.gwtbootstrap.client.ui.TextBox) GWT.create(com.github.gwtbootstrap.client.ui.TextBox.class);
      // Setup section.
      searchField.setPlaceholder("Album..");
      searchField.addKeyUpHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);


      owner.searchField = searchField;

      return searchField;
    }

    /**
     * Getter for submitButton called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.github.gwtbootstrap.client.ui.Button get_submitButton() {
      return build_submitButton();
    }
    private com.github.gwtbootstrap.client.ui.Button build_submitButton() {
      // Creation section.
      final com.github.gwtbootstrap.client.ui.Button submitButton = (com.github.gwtbootstrap.client.ui.Button) GWT.create(com.github.gwtbootstrap.client.ui.Button.class);
      // Setup section.
      submitButton.setStyleName("" + get_style().important() + "");
      submitButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);


      owner.submitButton = submitButton;

      return submitButton;
    }

    /**
     * Getter for domId0Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId0Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId0Element() {
      return domId0Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId0Element() {
      // Creation section.
      domId0Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId0());
      // Setup section.


      return domId0Element;
    }

    /**
     * Getter for domId1 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId1;
    private java.lang.String get_domId1() {
      return domId1;
    }
    private java.lang.String build_domId1() {
      // Creation section.
      domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId1;
    }

    /**
     * Getter for panel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_panel() {
      return build_panel();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_panel() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel panel = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.


      owner.panel = panel;

      return panel;
    }

    /**
     * Getter for domId1Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId1Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId1Element() {
      return domId1Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId1Element() {
      // Creation section.
      domId1Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId1());
      // Setup section.


      return domId1Element;
    }
  }
}
