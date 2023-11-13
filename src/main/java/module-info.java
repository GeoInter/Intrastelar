module thb.fbi.leguan {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.swing;
    requires transitive javafx.graphics;
    requires org.fxmisc.richtext;
    requires org.antlr.antlr4.runtime;
    requires org.fxmisc.flowless;
    requires reactfx;
    requires java.desktop;

    opens thb.fbi.leguan.controller to javafx.fxml;
    opens thb.fbi.pipeline_visualizer.controller to javafx.fxml;
    exports thb.fbi.leguan;
}
