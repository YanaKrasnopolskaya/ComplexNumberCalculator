package model.logging.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

import model.calculate.impl.Complex;
import model.logging.Logger;

public class FileLogger implements Logger<Complex> {
    private final File logFile;

    public FileLogger(String logFilePath) throws IOException {
        this.logFile = new File(logFilePath);
        if (!logFile.exists()) {
            logFile.createNewFile();
        }
    }

    @Override
    public void log(LocalDateTime time, String message, Complex res) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))) {
            writer.write(time + " ");
            writer.write(message + " ");
            writer.write(res + " " + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
