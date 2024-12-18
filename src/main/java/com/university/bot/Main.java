package com.university.bot;

import org.telegram.telegrambots.longpolling.TelegramBotsLongPollingApplication;
//import org.telegram.telegrambots.exception.TelegramApiException;
//import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Main {
    public static void main(String[] args){
//        // TODO Instantiate Telegram API
//        TelegramBotsLongPollingApplication botsApplication = new TelegramBotsLongPollingApplication();
//
//        // TODO Register our bot
//        String botToken = "7713025774:AAFjV0AnEKhW9Mm4AsPLh0O8abxIK19tfOk";
//        botsApplication.registerBot(botToken, new routeBot(botToken));
//        System.out.println("Bot successfully started!");

//        Instantiate Telegram API
//        TODO Register our bot
        String botToken = "7713025774:AAFjV0AnEKhW9Mm4AsPLh0O8abxIK19tfOk";
        try (TelegramBotsLongPollingApplication botsApplication = new TelegramBotsLongPollingApplication()) {
            botsApplication.registerBot(botToken, new routeBot(botToken));
            System.out.println("Bot successfully started!");
            // Ensure this prcess wait forever
            Thread.currentThread().join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}