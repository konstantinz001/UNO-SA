var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "3600",
        "ok": "3202",
        "ko": "398"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "28"
    },
    "maxResponseTime": {
        "total": "6664",
        "ok": "6115",
        "ko": "6664"
    },
    "meanResponseTime": {
        "total": "140",
        "ok": "38",
        "ko": "956"
    },
    "standardDeviation": {
        "total": "649",
        "ok": "212",
        "ko": "1641"
    },
    "percentiles1": {
        "total": "28",
        "ok": "5",
        "ko": "40"
    },
    "percentiles2": {
        "total": "32",
        "ok": "31",
        "ko": "1387"
    },
    "percentiles3": {
        "total": "448",
        "ok": "51",
        "ko": "4981"
    },
    "percentiles4": {
        "total": "3622",
        "ok": "593",
        "ko": "6481"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 3179,
    "percentage": 88
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 8,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 15,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 398,
    "percentage": 11
},
    "meanNumberOfRequestsPerSecond": {
        "total": "19.672",
        "ok": "17.497",
        "ko": "2.175"
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
        "total": "1800",
        "ok": "1402",
        "ko": "398"
    },
    "minResponseTime": {
        "total": "27",
        "ok": "27",
        "ko": "28"
    },
    "maxResponseTime": {
        "total": "6664",
        "ok": "6115",
        "ko": "6664"
    },
    "meanResponseTime": {
        "total": "265",
        "ok": "69",
        "ko": "956"
    },
    "standardDeviation": {
        "total": "897",
        "ok": "308",
        "ko": "1641"
    },
    "percentiles1": {
        "total": "32",
        "ok": "31",
        "ko": "40"
    },
    "percentiles2": {
        "total": "40",
        "ok": "35",
        "ko": "1387"
    },
    "percentiles3": {
        "total": "1896",
        "ok": "55",
        "ko": "4981"
    },
    "percentiles4": {
        "total": "5339",
        "ok": "1203",
        "ko": "6481"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1379,
    "percentage": 77
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 8,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 15,
    "percentage": 1
},
    "group4": {
    "name": "failed",
    "count": 398,
    "percentage": 22
},
    "meanNumberOfRequestsPerSecond": {
        "total": "9.836",
        "ok": "7.661",
        "ko": "2.175"
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
        "total": "1800",
        "ok": "1800",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "696",
        "ok": "696",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "14",
        "ok": "14",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "72",
        "ok": "72",
        "ko": "-"
    },
    "percentiles1": {
        "total": "2",
        "ok": "2",
        "ko": "-"
    },
    "percentiles2": {
        "total": "3",
        "ok": "3",
        "ko": "-"
    },
    "percentiles3": {
        "total": "11",
        "ok": "11",
        "ko": "-"
    },
    "percentiles4": {
        "total": "492",
        "ok": "492",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1800,
    "percentage": 100
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "9.836",
        "ok": "9.836",
        "ko": "-"
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
