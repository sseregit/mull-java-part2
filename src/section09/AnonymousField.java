package section09;

class MyAnonymousWindow {
    interface OnClickListener {
        public void onCLick();
    }

    OnClickListener listener = new MyAnonymousWindow.OnClickListener() {
        @Override
        public void onCLick() {
            System.out.println("MyAnonymous listener");
        }
    };

    public void click() {
        listener.onCLick();
    }
}

public class AnonymousField {
    public static void main(String[] args) {
        MyAnonymousWindow win = new MyAnonymousWindow();
        win.click();
    }
}
