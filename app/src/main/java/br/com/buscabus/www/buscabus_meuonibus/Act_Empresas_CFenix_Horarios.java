package br.com.buscabus.www.buscabus_meuonibus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Act_Empresas_CFenix_Horarios extends AppCompatActivity {

    private android.webkit.WebView WebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act__empresas__cfenix__horarios);

        // Comandos para o WebView
        WebView = findViewById(R.id.WebView);
        WebView.getSettings().setJavaScriptEnabled(true);
        WebView.setWebViewClient(new WebViewClient());

        // Pega a inteção com o nome das linha
        Intent intent = getIntent();
        final String parametroNomeLinha = (String) intent.getSerializableExtra("Nome da Linha");

        // Parametro para exibir Mapa
        switch(parametroNomeLinha) {
            case "100 - Madrugadao Centro-UFSC":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/madrugadao-centro-ufsc,100");
                break;
            case "101 - Circular Centro":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/circular-centro,101");
                break;
            case "104 - TICEN-Itacorubi via Mauro Ramos":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/ticen-itacorubi-via-mauro-ramos,104");
                break;
            case "110 - TITRI-TICEN Direto":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/titri-ticen-direto,110");
                break;
            case "1112 - Executivo Santa Mônica":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-santa-monica,1112");
                break;
            case "1113 - Executivo Parque São Jorge":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-parque-sao-jorge,1113");
                break;
            case "1115 - Executivo Córrego Grande via G D`Eça":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-corrego-grande-gama-deca,1115");
                break;
            case "1117 - Executivo João Paulo":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-joao-paulo,1117");
                break;
            case "1120 - Executivo Canasvieiras":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-canasvieiras,1120");
                break;
            case "1121 - Executivo Ingleses/Santinho":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-ingleses-santinho,1121");
                break;
            case "1122 - Executivo Praia Brava":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-praia-brava,1122");
                break;
            case "1123 - Executivo Jurerê":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-jurere,1123");
                break;
            case "1125 - Executivo Rio Vermelho":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-rio-vermelho,1125");
                break;
            case "1126 - Executivo Cachoeira":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-cachoeira,1126");
                break;
            case "1127 - Executivo Gaivotas":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-gaivotas,1127");
                break;
            case "1128 - Executivo Costa do Moçambique":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-costa-do-mocambique,1128");
                break;
            case "1129 - Executivo Muquem":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-muquem,1129");
                break;
            case "131 - TITRI-TICEN via Gama D`Eça":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/titri-ticen-via-gama-deca,131");
                break;
            case "132 - TITRI-TICEN via Gama D`Eça/HI":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/titri-ticen-via-gama-deca-hi,132");
                break;
            case "133 - TITRI-TICEN via Mauro Ramos":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/titri-ticen-via-mauro-ramos,133");
                break;
            case "134 - TITRI-TICEN via Beira Mar":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/titri-ticen-via-beira-mar,134");
                break;
            case "135 - Volta ao Morro/Carvoeira Norte":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/volta-ao-morro-carvoeira-norte,135");
                break;
            case "136 - Volta ao Morro/Carvoeira Sul":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/volta-ao-morro-carvoeira-sul,136");
                break;
            case "137 - Volta ao Morro/Pantanal Norte":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/volta-ao-morro-pantanal-norte,137");
                break;
            case "138 - Volta ao Morro/Pantanal Sul":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/volta-ao-morro-pantanal-sul,138");
                break;
            case "150 - TICEN-Itacorubi via Beira Mar":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/ticen-itacorubi-via-beira-mar,150");
                break;
            case "151 - Centro Aministrativo via Beira Mar":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/centro-administrativo-via-beira-mar-norte,151");
                break;
            case "153 - Costeira do Pirajubaé":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/costeira-do-pirajubae,153");
                break;
            case "155 - Sol Nascente":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/sol-nascente,155");
                break;
            case "160 - Morro da Cruz":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/morro-da-cruz,160");
                break;
            case "161 - Morro da Penitenciária":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/morro-da-penitenciaria,161");
                break;
            case "162 - Saco dos Limões":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/saco-dos-limoes,162");
                break;
            case "163 - Córrego Grande":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/corrego-grande,163");
                break;
            case "164 - Córrego Grande - Poção":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/corrego-grande-pocao,164");
                break;
            case "165 - Itacorubi":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/itacorubi,165");
                break;
            case "167 - João Paulo":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/joao-paulo,167");
                break;
            case "168 - Monte Verde":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/monte-verde,168");
                break;
            case "169 - Monte Verde via Mané Vicente":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/monte-verde-via-mane-vicente,169");
                break;
            case "170 - Caminho da Cruz via João Paulo":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/caminho-da-cruz-via-joao-paulo,170");
                break;
            case "172 - Parque São Jorge via SC 404":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/parque-sao-jorge-via-sc-404,172");
                break;
            case "173 - Morro do Quilombo":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/morro-do-quilombo,173");
                break;
            case "174 - Saco Grande via João Paulo":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/saco-grande-via-joao-paulo,174");
                break;
            case "175 - SC 401 Retorno/Saco Grande":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/sc-401-retorno-saco-grande,175");
                break;
            case "176 - Saco Grande via HU":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/saco-grande-via-hu,176");
                break;
            case "177 - Santa Mônica":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/santa-monica,177");
                break;
            case "178 - Saco Grande/Retorno SC 401":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/saco-grande-retorno-sc-401,178");
                break;
            case "179 - Serrinha":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/serrinha,179");
                break;
            case "180 - TITRI-UFSC":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/titri-ufsc,180");
                break;
            case "181 - Cacupé/João Paulo via Barreira do Janga":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/cacupe-joao-paulo-via-barreira-do-janga,181");
                break;
            case "182 - Tecnópolis":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tecnopolis,182");
                break;
            case "183 - Corredor Sudoeste":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/corredor-sudoeste,183");
                break;
            case "184 - UDESC via Beira Mar":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/udesc-via-beira-mar,184");
                break;
            case "185 - UFSC Semidireto":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/ufsc-semidireto,185");
                break;
            case "186 - Corredor Sudoeste Semidireto":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/corredor-sudoeste-semidireto,186");
                break;
            case "191 - TITRI-TICEN via Transcaeira":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/titri-ticen-via-transcaeira,191");
                break;
            case "200 - Madrugadão Norte":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/madrugadao-norte,200");
                break;
            case "210 - TICAN-TICEN Direto":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tican-ticen-direto,210");
                break;
            case "212 - TISAN-TICEN Direto":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tisan-ticen-direto,212");
                break;
            case "2120 - Executivo Barra da Lagoa":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-barra-da-lagoa,2120");
                break;
            case "2123 - Executivo Lagoa da Conceição via Joaquina":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-lagoa-da-conceicao-via-joaquina,2123");
                break;
            case "2124 - Executivo Sambaqui":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-sambaqui,2124");
                break;
            case "221 - TICAN-TICEN via Mauro Ramos":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tican-ticen-via-mauro-ramos,221");
                break;
            case "230 - Canasvieiras via Gama D`Eça":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/canasvieiras-via-gama-deca,230");
                break;
            case "231 - TICAN-TICEN via TITRI":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tican-ticen-via-titri,231");
                break;
            case "233 - TICAN-TITRI via UFSC":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tican-titri-via-ufsc,233");
                break;
            case "235 - TICAN-TITRI via TISAN":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tican-titri-via-tisan,235");
                break;
            case "250 - Forte-Canasvieiras":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/forte-canasvieiras,250");
                break;
            case "260 - Cachoeira do Bom Jesus":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/cachoeira-do-bom-jesus,260");
                break;
            case "261 - Capivari via Graciliano Gomes":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/capivari-via-graciliano-gomes,261");
                break;
            case "262 - Circular Canasvieiras":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/circular-canasvieiras,262");
                break;
            case "263 - Gaivotas":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/gaivotas,263");
                break;
            case "264 - Ingleses":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/ingleses,264");
                break;
            case "265 - Ponta das Canas":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/ponta-das-canas,265");
                break;
            case "266 - Praia Brava":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/praia-brava,266");
                break;
            case "267 - Rio Vermelho":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/rio-vermelho,267");
                break;
            case "268 - Sitio de Baixo":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/sitio-de-baixo,268");
                break;
            case "269 - Moçambique via Alzira Rosa Aguiar":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/mocambique-via-r-alzira-rosa-aguiar,269");
                break;
            case "270 - Vargem Grande":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/vargem-grande,270");
                break;
            case "271 - Daniela":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/daniela,271");
                break;
            case "272 - Jurerê":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/jurere,272");
                break;
            case "273 - Circular Ratones":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/circular-ratones,273");
                break;
            case "274 - Rio Vermelho via Muquem":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/rio-vermelho-via-muquem,274");
                break;
            case "276 - Balneário Canasvieiras":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/balneario-canasvieiras,276");
                break;
            case "277 - Balneário Ingleses":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/balneario-ingleses,277");
                break;
            case "280 - Cachoeira-TICAN":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/cachoeira-tican,280");
                break;
            case "281 - Costa do Moçambique":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/costa-do-mocambique,281");
                break;
            case "282 - Vargem Pequena":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/vargem-pequena,282");
                break;
            case "283 - Vargem do Bom Jesus":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/vargem-do-bom-jesus,283");
                break;
            case "284 - Moçambique via Rua da Intendência":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/mocambique-via-rua-da-intendencia,284");
                break;
            case "285 - Circular Moçambique":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/circular-mocambique,285");
                break;
            case "286 - TICAN-Sapiens Parque":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tican-sapiens-parque,286");
                break;
            case "291 - Circular Canasvieiras/Praia Brava":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/circular-canasvieiras-praia-brava,291");
                break;
            case "294 - Interpraias":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/interpraias,294");
                break;
            case "296 - Circular Santinho/Ingleses":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/circular-santinho-ingleses,296");
                break;
            case "":
                WebView.loadUrl("");
                break;


        }

    }
}