package com.ekambi.cv.client.slider;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.CssResource.NotStrict;
import com.google.gwt.resources.client.ImageResource;

public interface Resources extends ClientBundle {

    public static final Resources instance = GWT.create(Resources.class);

    @NotStrict
    CssResource main();

    @NotStrict
    CssResource shownotes();

    @Source("com/ekambi/cv/assets/me.jpg")
    ImageResource photo();

    @Source("com/ekambi/cv/assets/me.jpg")
    ImageResource me();

}
