package section09;

class MyPoint {
    int x;
    int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class MyWindow {
    interface OnClickListener {
        public void onCLick(MyPoint point);
    }

    OnClickListener listener;

    public MyWindow(OnClickListener listener) {
        this.listener = listener;
    }

    void click(MyPoint point) {
        listener.onCLick(point);
    }
}

class ButtonListener implements MyWindow.OnClickListener {
    @Override
    public void onCLick(MyPoint point) {
        System.out.print("ButtonListener.onCLick: ");
        System.out.println(point.x + " " + point.y);
    }
}

public class NestedInterface {
    public static void main(String[] args) {
        MyWindow win = new MyWindow(new ButtonListener());
        win.click(new MyPoint(10, 10));
        win.click(new MyPoint(200, 150));
    }
}
