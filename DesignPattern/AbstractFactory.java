package DesignPattern;

public class AbstractFactory {
    public static void main(String[] args) {
        GUIFactory windowsFactory = new WindowsFactory();
        Checkbox windowsCheckbox = windowsFactory.createCheckbox();
        Button windowsButton = windowsFactory.createButton();
        windowsCheckbox.check();
        windowsButton.click();

        GUIFactory macFactory = new MacFactory();
        Checkbox macCheckbox = macFactory.createCheckbox();
        Button macButton = macFactory.createButton();
        macCheckbox.check();
        macButton.click();
    }
}
interface Checkbox{
    void check();
}

interface Button{
    void click();
}

class WindowsCheckbox implements Checkbox{
    public void check(){
        System.out.println("Windows Checkbox checked");
    }
}

class MacCheckbox implements Checkbox{
    public void check(){
        System.out.println("Mac Checkbox checked");
    }
}

class WindowsButton implements Button{
    public void click(){
        System.out.println("Windows Button clicked");
    }
}

class MacButton implements Button{
    public void click(){
        System.out.println("Mac Button clicked");
    }
}

interface GUIFactory{
    Checkbox createCheckbox();
    Button createButton();
}

class WindowsFactory implements GUIFactory{
    public Checkbox createCheckbox(){
        return new WindowsCheckbox();
    }
    public Button createButton(){
        return new WindowsButton();
    }
}

class MacFactory implements GUIFactory{
    public Checkbox createCheckbox(){
        return new MacCheckbox();
    }
    public Button createButton(){
        return new MacButton();
    }
}

