package ua.artcode.design_patterns.facade;

/**
 * Created by serhii on 19.12.15.
 */
public class Test {

    public static void main(String[] args) {
        new Computer().startComputer();
    }
}

/* Complex parts */

class CPU {
    public void freeze() {  }
    public void jump(long position) {  }
    public void execute() {  }
}

class Memory {
    public void load(long position, byte[] data) {  }
}

class HardDrive {
    public byte[] read(long lba, int size) { return null; }
}

/* Facade */

class Computer {
    private static final long BOOT_ADDRESS = 1000;
    private static final long BOOT_SECTOR = 2000;
    private static final int SECTOR_SIZE = 500;
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        cpu.freeze();
        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        cpu.jump(BOOT_ADDRESS);
        cpu.execute();
    }
}

/* Client */
