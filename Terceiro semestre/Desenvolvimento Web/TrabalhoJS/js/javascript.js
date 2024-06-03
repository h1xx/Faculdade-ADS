//Receita Mensal
google.charts.load("current", { packages: ["corechart"] });
google.charts.setOnLoadCallback(drawChartReceitaMensal);
function drawChartReceitaMensal() {
  var data = google.visualization.arrayToDataTable([
    ["Mês", "Vendas"],
    ["Jan", 257362],
    ["Fev", 335647],
    ["Mar", 247893],
    ["Abr", 360137],
    ["Mai", 347263],
    ["Jun", 400000],
  ]);

  var options = {
    title: "Receita Mensal 2023 (R$)",
    width: 500,
    height: 250,
    seriesType: "bars",
    backgroundColor: "#D3D3D3",
    colors: ["#2F4F4F", "#818591"],
    series: { 7: { type: "line" } },
  };

  var chart = new google.visualization.ComboChart(
    document.getElementById("receita_mensal")
  );
  chart.draw(data, options);
}

//Ticket Médio
google.charts.load("current", { packages: ["corechart"] });
google.charts.setOnLoadCallback(drawChartTicketMedio);
function drawChartTicketMedio() {
  var data = google.visualization.arrayToDataTable([
    ["mês", "Ticket Médio", { role: "style" }],
    ["Janeiro", 532, "#5F9EA0"],
    ["Fevereiro", 466, "#66CDAA"],
    ["Março", 365, "#7FFFD4"],
    ["Abril", 479, "#20B2AA"],
    ["Maio", 588, "#48D1CC"],
    ["Junho", 469, "#00FFFF"],
    ["Julho", 582, "#ADD8E6"],
    ["Agosto", 602, "#1E90FF"],
    ["Setembro", 480, "#4169E1"],
    ["Outubro", 530, "#6495ED"],
    ["Novembro", 595, "#483D8B"],
    ["Dezembro", 630, "#6A5ACD"],
  ]);

  var view = new google.visualization.DataView(data);
  view.setColumns([
    0,
    1,
    { calc: "stringify", sourceColumn: 1, type: "string", role: "annotation" },
    2,
  ]);

  var options = {
    title: "Valor médio gasto por cliente (R$)",
    width: 500,
    height: 250,
    backgroundColor: "#D3D3D3",
    bar: { groupWidth: "55%" },
    legend: { position: "none" },
  };
  var chart = new google.visualization.BarChart(
    document.getElementById("ticket_medio")
  );
  chart.draw(view, options);
}

//Lucro e Despezas
google.charts.load("current", { packages: ["corechart"] });
google.charts.setOnLoadCallback(drawChartLucroDespezas);

function drawChartLucroDespezas() {
  var data = google.visualization.arrayToDataTable([
    ["Ano", "Lucro", "Despeza"],
    ["2020", 40152, 30132],
    ["2021", 30215, 29462],
    ["2022", 35139, 28132],
    ["2023", 55123, 32025],
  ]);

  var options = {
    title: "Performance: Lucro x Despezas",
    hAxis: { title: "Ano", titleTextStyle: { color: "#333" } },
    vAxis: { minValue: 0 },
    backgroundColor: "#D3D3D3",
    width: 500,
    height: 250,
  };

  var chart = new google.visualization.AreaChart(
    document.getElementById("lucro_despezas")
  );
  chart.draw(data, options);
}

//Retorno de Clientes
google.charts.load("current", { packages: ["corechart"] });
google.charts.setOnLoadCallback(drawChartRetornoClientes);
function drawChartRetornoClientes() {
  var data = google.visualization.arrayToDataTable([
    ["Meses", "Qtd Retorno "],
    ["Jan", 550],
    ["Fev", 460],
    ["Mar", 702],
    ["Abr", 420],
  ]);

  var options = {
    title: "Retorno de Clientes",
    is3D: true,
    backgroundColor: "#D3D3D3",
    width: 500,
    height: 250,
  };

  var chart = new google.visualization.PieChart(
    document.getElementById("retorno_clientes")
  );
  chart.draw(data, options);
}

//Taxa de Insatisfação
google.charts.load("current", { packages: ["corechart"] });
google.charts.setOnLoadCallback(drawChartTaxaInsatisfacao);
function drawChartTaxaInsatisfacao() {
  var data = google.visualization.arrayToDataTable([
    ["Meses", "Insatisfação"],
    ["Jan", 560],
    ["Fev", 500],
    ["Mar", 420],
    ["Abr", 480],
    ["Mai", 600],
    ["Jun", 650],
  ]);

  var options = {
    title: "Taxa de Insatisfação",
    pieHole: 0.4,
    backgroundColor: "#D3D3D3",
    width: 500,
    height: 250,
  };

  var chart = new google.visualization.PieChart(
    document.getElementById("taxa_insatisfacao")
  );
  chart.draw(data, options);
}

//Vendas totais
google.charts.load("current", { packages: ["corechart"] });
google.charts.setOnLoadCallback(drawChartVendasTotais);

function drawChartVendasTotais() {
  var data = google.visualization.arrayToDataTable([
    ["Ano", "Vendas"],
    ["2020", 15906],
    ["2021", 19460],
    ["2022", 22862],
    ["2023", 23364],
  ]);

  var options = {
    title: "Vedas Anuais (unidades)",
    backgroundColor: "#D3D3D3",
    width: 500,
    height: 250,
    seriesType: "bars",
    backgroundColor: "#D3D3D3",
    colors: ["#2F4F4F", "#818591"],
    series: { 5: { type: "line" } },
  };

  var chart = new google.visualization.ComboChart(
    document.getElementById("vendas_totais")
  );
  chart.draw(data, options);
}
//Quantidade de Transações
google.charts.load("current", { packages: ["corechart"] });
google.charts.setOnLoadCallback(drawChartQtdTransacoes);

function drawChartQtdTransacoes() {
  var data = google.visualization.arrayToDataTable([
    ["Ano", "Transações"],
    ["2020", 5540],
    ["2021", 7230],
    ["2022", 6512],
    ["2023", 6125],
  ]);

  var options = {
    title: "Quantidade Transações",
    curveType: "function",
    legend: { position: "bottom" },
    backgroundColor: "#D3D3D3",
    width: 500,
    height: 250,
  };

  var chart = new google.visualization.LineChart(
    document.getElementById("quantidade_transacoes")
  );

  chart.draw(data, options);
}

//Vendas por Região
google.charts.load("current", {
  packages: ["geochart"],
});
google.charts.setOnLoadCallback(drawRegionsMap);

function drawRegionsMap() {
  var data = google.visualization.arrayToDataTable([
    ["País", "Vendas"],
    ["Australia", 542],
    ["US", 1860],
    ["Brazil", 2130],
    ["Canada", 1550],
    ["Mexico", 952],
    ["Russia", 543],
    ["China", 700],
    ["Argentina", 1420],
  ]);

  var options = {
    title: "Vendas por Países",
    backgroundColor: "#D3D3D3",
    width: 500,
    height: 250,
    colors: ["#2F4F4F", "#2F4F4F"],
  };

  var chart = new google.visualization.GeoChart(
    document.getElementById("venda_regiao")
  );

  chart.draw(data, options);
}

//Estoque Médio
google.charts.load("current", { packages: ["corechart"] });
google.charts.setOnLoadCallback(drawEstoqueMedio);

function drawEstoqueMedio() {
  // Some raw data (not necessarily accurate)
  var data = google.visualization.arrayToDataTable([
    [
      "Month",
      "Parceiro 1",
      "Parceiro 2",
      "Parceiro 3",
      "Parceiro 4",
      "Parceiro 5",
      "Meta de Vendas",
    ],
    ["Jan/2023", 500, 938, 522, 998, 450, 450],
    ["Fev/2023", 432, 1120, 599, 1268, 288, 500],
    ["Mar/2023", 650, 1167, 587, 807, 397, 550],
    ["Abr/2023", 430, 1110, 615, 968, 215, 600],
    ["Mai/2023", 560, 691, 629, 1026, 366, 650],
  ]);

  var options = {
    backgroundColor: "#D3D3D3",
    width: 500,
    height: 250,
    title: "Estoque Médio",
    vAxis: { title: "Quantidade" },
    hAxis: { title: "Meses" },
    seriesType: "bars",
    series: { 5: { type: "line" } },
  };

  var chart = new google.visualization.ComboChart(
    document.getElementById("estoque_medio")
  );
  chart.draw(data, options);
}

//Taxa de Devolução
google.charts.load("current", { packages: ["corechart"] });
google.charts.setOnLoadCallback(drawChartDevolucao);

function drawChartDevolucao() {
  var data = google.visualization.arrayToDataTable([
    ["Mês", "Quantidade"],
    ["Jan", 20],
    ["Fev", 11],
    ["Mar", 15],
    ["Abr", 16],
    ["Mai", 19],
  ]);

  var options = {
    backgroundColor: "#D3D3D3",
    width: 500,
    height: 250,
    title: "Taxa de Devolução Mensal",
  };

  var chart = new google.visualization.PieChart(
    document.getElementById("taxa_devolucao")
  );

  chart.draw(data, options);
}

//Functions
function getClientLogo(name) {
  const apiUrl = "https://api.api-ninjas.com/v1/logo?name=" + name;
  const headers = {
    "Content-Type": "application/json",
    "X-Api-Key": "OleMI6jD+oMBurVFXBt9kQ==qVLiJS1hk3HCkkxc",
  };

  const requestOptions = {
    method: "GET",
    headers: headers,
  };
  return new Promise((resolve, reject) => {
    fetch(apiUrl, requestOptions)
      .then((response) => {
        if (!response.ok) {
          throw new Error("Erro ao carregar a logo " + name);
        }
        resolve(response.json());
      })
      .catch((error) => {
        reject(error);
      });
  });
}

window.onload = function () {
  getClientLogo("Microsoft")
    .then((response) => {
      const imagem = document.getElementById("slide1");
      imagem.src = response[0].image;
    })
    .catch((error) => {
      console.error("Ocorreu um erro:", error);
    });

  getClientLogo("Netflix")
    .then((response) => {
      const imagem = document.getElementById("slide2");
      imagem.src = response[0].image;
    })
    .catch((error) => {
      console.error("Ocorreu um erro:", error);
    });

  getClientLogo("Amazon")
    .then((response) => {
      const imagem = document.getElementById("slide3");
      imagem.src = response[0].image;
    })
    .catch((error) => {
      console.error("Ocorreu um erro:", error);
    });

  getClientLogo("Walt Disney")
    .then((response) => {
      const imagem = document.getElementById("slide4");
      imagem.src = response[0].image;
    })
    .catch((error) => {
      console.error("Ocorreu um erro:", error);
    });
};

let count = 1;
document.getElementById("radio1").checked = true;
setInterval(function () {
  nextImage();
}, 5000);

function nextImage() {
  count++;
  if (count > 4) {
    count = 1;
  }
  document.getElementById("radio" + count).checked = true;
}
