package study.dev.figures.validator;

import study.dev.figures.gui.App;

public class AppValidator extends ModelValidator<App> {
    @Override
    public void validate(App model) {
        String text1 = model.getTextField1().getText();
        String text2 = model.getTextField2().getText();
        if (model.getTextField1().isVisible() && text1.isEmpty()) {
            addErrors("", "");
        }

        if (text2.isEmpty()) {
            addErrors("", "");
        }

        try {
            if (model.getTextField1().isVisible()) {
                Float.parseFloat(text1);
            }
        } catch (Exception e) {
            addErrors("", "");
        }

        try {
            Float.parseFloat(text2);
        } catch (Exception e) {
            addErrors("", "");
        }

    }
}
