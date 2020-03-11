package adapter;

import java.util.LinkedList;
import java.util.List;

public class Main {
    private List<SocketAdapter> adapters = new LinkedList<SocketAdapter>();
    public Main() {
        this.adapters.add(new ChinaSocketAdapter());
        this.adapters.add(new USASocketAdapter());
    }

    public SocketAdapter getSocketAdapter(Socket socket) {
        SocketAdapter socketAdapter = null;
        for (SocketAdapter s : this.adapters) {
            if (s.support(socket)) {
                socketAdapter = s;
                break;
            }
        }
        return socketAdapter;
    }


    public static void main(String[] args) {
        Main main = new Main();
        Socket chinaSocket = new ChinaSocket();
        SocketAdapter adapter = main.getSocketAdapter(chinaSocket);
        adapter.socket(chinaSocket);
        // CSP-1234 participant policyController——policyDetial
        Socket USASocket = new USASocket();
        adapter = main.getSocketAdapter(USASocket);
        adapter.socket(USASocket);
    }


}
