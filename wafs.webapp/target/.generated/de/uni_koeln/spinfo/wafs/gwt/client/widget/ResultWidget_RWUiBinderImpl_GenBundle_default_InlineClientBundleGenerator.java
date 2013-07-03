package de.uni_koeln.spinfo.wafs.gwt.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ResultWidget_RWUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements de.uni_koeln.spinfo.wafs.gwt.client.widget.ResultWidget_RWUiBinderImpl_GenBundle {
  private static ResultWidget_RWUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new ResultWidget_RWUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new de.uni_koeln.spinfo.wafs.gwt.client.widget.ResultWidget_RWUiBinderImpl_GenCss_style() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return (".GETOI3HCGO{font-weight:" + ("bold")  + ";}");
      }
      public java.lang.String important(){
        return "GETOI3HCGO";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static de.uni_koeln.spinfo.wafs.gwt.client.widget.ResultWidget_RWUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public de.uni_koeln.spinfo.wafs.gwt.client.widget.ResultWidget_RWUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static de.uni_koeln.spinfo.wafs.gwt.client.widget.ResultWidget_RWUiBinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@de.uni_koeln.spinfo.wafs.gwt.client.widget.ResultWidget_RWUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
