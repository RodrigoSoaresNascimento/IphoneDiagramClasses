package view;

import entities.Contact;
import entities.Music;
import entities.Page;
import interfaces.InternetBrowser;
import interfaces.MusicPlayer;
import interfaces.Telephone;

public class Iphone implements InternetBrowser, MusicPlayer, Telephone {

    @Override
    public String displayPage() {
        return "mostrando pagina web";
    }

    @Override
    public String addNewPage(String url) {
        return "adiconando nova pagina"+url;
    }

    @Override
    public String updatePage(Page page, String url) {
        return page.toString();
    }

    @Override
    public String closePage(String url) {
        return "encerrando pagina web"+url;
    }

    @Override
    public String fecthWebPage(String url) {
        return "buscando uma pagina na web"+url;
    }

    @Override
    public String playMusic(Music music) {
        return "tocando uma musica"+music;
    }

    @Override
    public String pauseMusic(Music music) {
        return "pausando uma musica "+music;
    }

    @Override
    public String selectMusic(Music music) {
        return "selecionando uma musica"+music;
    }

    @Override
    public String advanceMusic() {
        return "avancando o tempo da musica que está tocando";
    }

    @Override
    public String toConnect(Contact contact) {
        return "realizando uma ligação para o contato"+contact;
    }

    @Override
    public String attendant(Contact contact) {
        return "atententendo a ligação do contato"+contact;
    }

    @Override
    public String voiceEmail(Contact contact) {
        return "enviando um email de voz para o contato"+contact;
    }

    @Override
    public void rejectConnection(String phoneNumber) {

    }

    @Override
    public String endCall() {
        return "encerrando a ligação atual";
    }
}
