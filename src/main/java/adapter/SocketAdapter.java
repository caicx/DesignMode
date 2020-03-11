package adapter;

public interface SocketAdapter {
    boolean support(Socket socket);

    String socket(Socket socket);
}
class ChinaSocketAdapter implements SocketAdapter {
    public static final String message = "中国充电口";

    @Override
    public boolean support(Socket socket) {
        return (message.equals(socket.socket()));
    }

    @Override
    public String socket(Socket socket) {
        System.out.println("通过适配器，将" + socket.socket() + "适配");
        return "充电成功";
    }
}

class USASocketAdapter implements SocketAdapter {
    public static final String message = "美国充电口";

    @Override
    public boolean support(Socket socket) {
        return (message.equals(socket.socket()));
    }

    @Override
    public String socket(Socket socket) {
        System.out.println("通过适配器，将 " + socket.socket() + "适配");
        return "充电成功";
    }
}
