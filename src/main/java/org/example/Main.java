package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ReplyService service = new ReplyService();

        System.out.println(service.reply("hi", ReplyType.FORMAL));
        System.out.println(service.reply("hello", ReplyType.FRIENDLY));
        System.out.println(service.reply("thanks", ReplyType.CONCISE));
        System.out.println(service.reply("   ", ReplyType.FORMAL));
        System.out.println(service.reply("random text", ReplyType.FRIENDLY));
    }
}