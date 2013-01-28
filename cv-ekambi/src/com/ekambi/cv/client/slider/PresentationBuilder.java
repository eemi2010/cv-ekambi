package com.ekambi.cv.client.slider;


import java.util.List;

import com.alexgorbatchev.syntaxhighlighter.client.Brush;
import com.ekambi.cv.client.slider.slides.ChapterHolder;

public interface PresentationBuilder {

    void definePreloadedBrushes(List<Brush> brushes);

    void loadChapters(ChapterHolder chapterHolder);

}