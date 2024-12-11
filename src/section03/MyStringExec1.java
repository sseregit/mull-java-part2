package section03;

class MyStringExec1 {

    private byte[] string;

    public MyStringExec1() {
    }

    public MyStringExec1(String param) {
        this.string = param.getBytes();
    }

    public MyStringExec1(int param) {
        this.string = String.valueOf(param).getBytes();
    }

    public int length() {
        if (this.string == null) {
            return 0;
        }

        return string.length;
    }

    public String getString() {
        if (this.length() == 0) {
            return "(null)";
        }

        return new String(string);
    }

    public void setString(String param) {
        this.string = param.getBytes();
    }

    public int compareTo(String param) {
        return param.compareTo(this.getString());
    }
}
