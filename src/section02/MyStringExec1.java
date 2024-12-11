package section02;

class MyStringExec1 {

    private byte[] string;

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
