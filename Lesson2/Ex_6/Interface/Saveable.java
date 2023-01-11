package Lesson2.Ex_6.Interface;

import Lesson2.Ex_6.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}