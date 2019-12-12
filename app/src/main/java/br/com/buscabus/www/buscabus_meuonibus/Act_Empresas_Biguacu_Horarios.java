package br.com.buscabus.www.buscabus_meuonibus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebViewClient;

public class Act_Empresas_Biguacu_Horarios extends AppCompatActivity {

    private android.webkit.WebView WebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act__empresas__biguacu__horarios);

        // Comandos para o WebView
        WebView = findViewById(R.id.WebView);
        WebView.getSettings().setJavaScriptEnabled(true);
        WebView.setWebViewClient(new WebViewClient());

        // Pega a inteção com o nome das linha
        Intent intent = getIntent();
        final String parametroNomeLinha = (String) intent.getSerializableExtra("Nome da Linha");

        // Parametro para exibir Mapa
        switch(parametroNomeLinha) {
            case "Antônio Carlos-Florianópolis":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/10500");
                break;
            case "Antônio Carlos-Biguaçu":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/64100");
                break;
            case "Araucária":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/11302");
                break;
            case "Armação da Piedade-Florianópolis":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/10300");
                break;
            case "Armação da Piedade-Biguaçu":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/10301");
                break;

        }

    }
}