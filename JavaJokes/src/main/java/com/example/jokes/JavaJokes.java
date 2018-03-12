package com.example.jokes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JavaJokes {

    Random r = new Random();
    List<String> jokes;

    public String getJokes() {
        initJoker();
        return jokes.get(r.nextInt(jokes.size()));
    }

    public String getFreeJokes() {
        initFreeJoker();
        return jokes.get(r.nextInt(jokes.size()));
    }

    private void initJoker() {
        jokes = new ArrayList<>();
        jokes.add("1-Joãozinho qual é o tempo da frase: Eu procuro um homem fiel? Joãozinho responde: É tempo perdido!");
        jokes.add("2-Joãozinho, me dê um exemplo de energia desperdiçada! Joãozinho responde: Contar uma história de arrepiar os cabelos para um careca");
        jokes.add("3-Porque o elefante nao pega fogo? Porque ele já é cinza");
        jokes.add("4-O que dá o cruzamento de pão, queijo e um macaco? X-panzé");
        jokes.add("5-O que o cavalo foi fazer no orelhão?Passar um trote");
        jokes.add("6-Porque a Angélica não mata baratas? Porque ela espera o Maurício Mattar");
        jokes.add("7-O que o tomate foi fazer no banco?Foi tirar extrato.");
        jokes.add("8-O que a galinha foi fazer na igreja ?Assistir a Missa do Galo.");
        jokes.add("9-Por que a mata é virgem?Porque o vento é fresco.");
        jokes.add("10-or que a Coca-Cola e a Fanta se dão muito bem?Porque se a Fanta quebra, a Coca-Cola !");
    }


    private void initFreeJoker() {
        jokes = new ArrayList<>();
        jokes.add("1-Batman pegou seu bat-sapato social e seu bat-blazer,aonde ele foi?A um Bat-zado");
        jokes.add("2-Dois litros de leite atravessaram a rua e foram atropelados.. Um morreu, o outro não, por quê? Por que um deles era Longa Vida");
        jokes.add("3-Porque o elefante nao pega fogo? Porque ele já é cinza");
        jokes.add("4-O que dá o cruzamento de pão, queijo e um macaco? X-panzé");
        jokes.add("5-O que o cavalo foi fazer no orelhão?Passar um trote");
    }
}
