package com.nttdata.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ConfiguraData {

    public static String dataHoraAtual() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public static String formataData(Date date) {
        DateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
        String dataFormatada = dateFormat.format(date);
        return dataFormatada;
    }

    public static String dataAtual() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyy");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public static String modificaData(int qtdTempo, String tempo) {
        Instant now = Instant.now(); //data de hoje
        Instant before = null;
        if (tempo.equals("D") || tempo.equals("d")) {
            before = now.plus(Duration.ofDays(qtdTempo));
        } else if (tempo.equals("M") || tempo.equals("m")) {
            qtdTempo = qtdTempo*30;
            before = now.plus(Duration.ofDays(qtdTempo));
        } else {
            qtdTempo = qtdTempo*365;
            before = now.plus(Duration.ofDays(qtdTempo));
        }
        Date dateBefore = Date.from(before);
        String dataModificada = formataData(dateBefore);
        return dataModificada;
    }

}
