var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "2000",
        "ok": "1407",
        "ko": "593"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "2044"
    },
    "maxResponseTime": {
        "total": "4616",
        "ok": "4616",
        "ko": "2514"
    },
    "meanResponseTime": {
        "total": "1189",
        "ok": "738",
        "ko": "2261"
    },
    "standardDeviation": {
        "total": "1039",
        "ok": "918",
        "ko": "122"
    },
    "percentiles1": {
        "total": "1038",
        "ok": "519",
        "ko": "2264"
    },
    "percentiles2": {
        "total": "2209",
        "ok": "1071",
        "ko": "2352"
    },
    "percentiles3": {
        "total": "2945",
        "ok": "3093",
        "ko": "2460"
    },
    "percentiles4": {
        "total": "3298",
        "ok": "3308",
        "ko": "2489"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 960,
    "percentage": 48
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 191,
    "percentage": 10
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 256,
    "percentage": 13
},
    "group4": {
    "name": "failed",
    "count": 593,
    "percentage": 30
},
    "meanNumberOfRequestsPerSecond": {
        "total": "250",
        "ok": "175.875",
        "ko": "74.125"
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
        "total": "1000",
        "ok": "407",
        "ko": "593"
    },
    "minResponseTime": {
        "total": "388",
        "ok": "388",
        "ko": "2044"
    },
    "maxResponseTime": {
        "total": "4616",
        "ok": "4616",
        "ko": "2514"
    },
    "meanResponseTime": {
        "total": "2052",
        "ok": "1748",
        "ko": "2261"
    },
    "standardDeviation": {
        "total": "724",
        "ok": "1053",
        "ko": "122"
    },
    "percentiles1": {
        "total": "2209",
        "ok": "1811",
        "ko": "2264"
    },
    "percentiles2": {
        "total": "2363",
        "ok": "2937",
        "ko": "2352"
    },
    "percentiles3": {
        "total": "3200",
        "ok": "3297",
        "ko": "2460"
    },
    "percentiles4": {
        "total": "3315",
        "ok": "3325",
        "ko": "2489"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 101,
    "percentage": 10
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 50,
    "percentage": 5
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 256,
    "percentage": 26
},
    "group4": {
    "name": "failed",
    "count": 593,
    "percentage": 59
},
    "meanNumberOfRequestsPerSecond": {
        "total": "125",
        "ok": "50.875",
        "ko": "74.125"
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
        "total": "1000",
        "ok": "1000",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "1125",
        "ok": "1125",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "327",
        "ok": "327",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "386",
        "ok": "386",
        "ko": "-"
    },
    "percentiles1": {
        "total": "145",
        "ok": "145",
        "ko": "-"
    },
    "percentiles2": {
        "total": "615",
        "ok": "615",
        "ko": "-"
    },
    "percentiles3": {
        "total": "1084",
        "ok": "1084",
        "ko": "-"
    },
    "percentiles4": {
        "total": "1119",
        "ok": "1119",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 859,
    "percentage": 86
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 141,
    "percentage": 14
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
        "total": "125",
        "ok": "125",
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
