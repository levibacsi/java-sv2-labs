package compositionlist.computer;

public class PersonalComputerMain {
    public static void main(String[] args) {
        Cpu cpu = new Cpu("i486", 100.0);
        Hardware hardware = new Hardware("BestBuy", "1995");
        Hardware display = new Hardware("Samsung", "SyncMaster 14");

        PersonalComputer pc = new PersonalComputer(cpu);
        Software dos = new Software("MS-DOS", 6.0);
        Software win = new Software("MS Windows", 3.1);

        pc.addHardware(hardware);
        pc.addHardware(display);
        pc.addSoftware(dos);
        pc.addSoftware(win);

        System.out.println(pc.getCpu());
        System.out.println(pc.getHardwares());
        System.out.println(pc.getSoftwares());

        System.out.println(pc);
    }
}
