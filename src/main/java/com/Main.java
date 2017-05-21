package com;

import javax.swing.*;
import java.awt.*;

/**
 * @author Daniel
 */
public class Main {

    public static void main(String... argv) {
        new Main();
    }

    private Main() {
        initialize();
    }

    private void initialize() {
        EventQueue.invokeLater(new SwingWorker<Runnable, Runnable>() {
            @Override
            protected Runnable doInBackground() throws Exception {
                return null;
            }

            @Override
            protected void done() {
            }
        });
    }

}
