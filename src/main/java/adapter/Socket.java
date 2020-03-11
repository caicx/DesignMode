package adapter;

public interface Socket {
    String socket();
}

class ChinaSocket implements Socket {
    public final String socket = "中国充电口";

    @Override
    public String socket() {
        return socket;
    }
}

class USASocket implements Socket {
    public final String socket = "美国充电口";

    @Override
    public String socket() {
        return socket;
    }
}
