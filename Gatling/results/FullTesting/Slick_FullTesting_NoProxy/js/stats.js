var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "10670",
        "ok": "7011",
        "ko": "3659"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "27"
    },
    "maxResponseTime": {
        "total": "36835",
        "ok": "30320",
        "ko": "36835"
    },
    "meanResponseTime": {
        "total": "1936",
        "ok": "784",
        "ko": "4142"
    },
    "standardDeviation": {
        "total": "5218",
        "ok": "2850",
        "ko": "7512"
    },
    "percentiles1": {
        "total": "61",
        "ok": "29",
        "ko": "2074"
    },
    "percentiles2": {
        "total": "2063",
        "ok": "150",
        "ko": "2429"
    },
    "percentiles3": {
        "total": "5537",
        "ok": "3281",
        "ko": "28513"
    },
    "percentiles4": {
        "total": "29765",
        "ok": "15836",
        "ko": "30183"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 5683,
    "percentage": 53
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 170,
    "percentage": 2
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 1158,
    "percentage": 11
},
    "group4": {
    "name": "failed",
    "count": 3659,
    "percentage": 34
},
    "meanNumberOfRequestsPerSecond": {
        "total": "32.63",
        "ok": "21.44",
        "ko": "11.19"
    }
},
contents: {
"req_load-ec4d1": {
        type: "REQUEST",
        name: "load",
path: "load",
pathFormatted: "req_load-ec4d1",
stats: {
    "name": "load",
    "numberOfRequests": {
        "total": "5335",
        "ok": "2171",
        "ko": "3164"
    },
    "minResponseTime": {
        "total": "27",
        "ok": "27",
        "ko": "27"
    },
    "maxResponseTime": {
        "total": "36835",
        "ok": "30320",
        "ko": "36835"
    },
    "meanResponseTime": {
        "total": "3413",
        "ok": "1872",
        "ko": "4471"
    },
    "standardDeviation": {
        "total": "7006",
        "ok": "4761",
        "ko": "8029"
    },
    "percentiles1": {
        "total": "2036",
        "ok": "41",
        "ko": "2113"
    },
    "percentiles2": {
        "total": "2506",
        "ok": "2063",
        "ko": "2541"
    },
    "percentiles3": {
        "total": "27422",
        "ok": "5571",
        "ko": "28959"
    },
    "percentiles4": {
        "total": "30121",
        "ok": "29549",
        "ko": "30206"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1383,
    "percentage": 26
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 65,
    "percentage": 1
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 723,
    "percentage": 14
},
    "group4": {
    "name": "failed",
    "count": 3164,
    "percentage": 59
},
    "meanNumberOfRequestsPerSecond": {
        "total": "16.315",
        "ok": "6.639",
        "ko": "9.676"
    }
}
    },"req_save-43781": {
        type: "REQUEST",
        name: "save",
path: "save",
pathFormatted: "req_save-43781",
stats: {
    "name": "save",
    "numberOfRequests": {
        "total": "5335",
        "ok": "4840",
        "ko": "495"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "2006"
    },
    "maxResponseTime": {
        "total": "13803",
        "ok": "13803",
        "ko": "2150"
    },
    "meanResponseTime": {
        "total": "458",
        "ok": "297",
        "ko": "2038"
    },
    "standardDeviation": {
        "total": "1006",
        "ok": "913",
        "ko": "23"
    },
    "percentiles1": {
        "total": "6",
        "ok": "3",
        "ko": "2033"
    },
    "percentiles2": {
        "total": "179",
        "ok": "89",
        "ko": "2046"
    },
    "percentiles3": {
        "total": "2051",
        "ok": "1883",
        "ko": "2087"
    },
    "percentiles4": {
        "total": "5904",
        "ok": "6355",
        "ko": "2129"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 4300,
    "percentage": 81
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 105,
    "percentage": 2
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 435,
    "percentage": 8
},
    "group4": {
    "name": "failed",
    "count": 495,
    "percentage": 9
},
    "meanNumberOfRequestsPerSecond": {
        "total": "16.315",
        "ok": "14.801",
        "ko": "1.514"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
