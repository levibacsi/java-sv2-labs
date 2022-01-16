package nestedclasses.dns;

import java.util.ArrayList;
import java.util.List;

public class NameServer {
    private static class DnsEntry{
        private String name;
        private String Ip;

        public DnsEntry(String name, String ip) {
            this.name = name;
            Ip = ip;
        }
    }

    private List<DnsEntry> domains = new ArrayList<>();

    public void addEntry(String hostName, String hostIp){
        for (DnsEntry entry: domains){
            if (entry.name.equals(hostName) || entry.Ip.equals(hostIp)){
                throw new IllegalArgumentException("Already exists");
            }
        }
        domains.add(new DnsEntry(hostName,hostIp));
    }

    public void removeEntryByName (String hostName){
        domains.removeIf(entry -> entry.name.equals(hostName));
    }

    public void removeEntryByIp (String hostIp){
        domains.removeIf(entry -> entry.Ip.equals(hostIp));
    }

    public String getIpByName (String hostName){
        for (DnsEntry entry: domains){
            if (entry.name.equals(hostName)){
                return entry.Ip;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    public String getNameByIp (String hostIp){
        for (DnsEntry entry: domains){
            if (entry.Ip.equals(hostIp)){
                return entry.name;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }
}
