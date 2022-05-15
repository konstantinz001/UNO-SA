var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "400",
        "ok": "400",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "2",
        "ok": "2",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "2509",
        "ok": "2509",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "697",
        "ok": "697",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "846",
        "ok": "846",
        "ko": "-"
    },
    "percentiles1": {
        "total": "81",
        "ok": "81",
        "ko": "-"
    },
    "percentiles2": {
        "total": "1479",
        "ok": "1479",
        "ko": "-"
    },
    "percentiles3": {
        "total": "2277",
        "ok": "2277",
        "ko": "-"
    },
    "percentiles4": {
        "total": "2407",
        "ok": "2407",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 247,
    "percentage": 62
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 33,
    "percentage": 8
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 120,
    "percentage": 30
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "66.667",
        "ok": "66.667",
        "ko": "-"
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
        "total": "200",
        "ok": "200",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "148",
        "ok": "148",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "2509",
        "ok": "2509",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "1389",
        "ok": "1389",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "689",
        "ok": "689",
        "ko": "-"
    },
    "percentiles1": {
        "total": "1485",
        "ok": "1485",
        "ko": "-"
    },
    "percentiles2": {
        "total": "1982",
        "ok": "1982",
        "ko": "-"
    },
    "percentiles3": {
        "total": "2373",
        "ok": "2373",
        "ko": "-"
    },
    "percentiles4": {
        "total": "2434",
        "ok": "2434",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 47,
    "percentage": 24
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 33,
    "percentage": 17
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 120,
    "percentage": 60
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "33.333",
        "ok": "33.333",
        "ko": "-"
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
        "total": "200",
        "ok": "200",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "2",
        "ok": "2",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "13",
        "ok": "13",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "5",
        "ok": "5",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "2",
        "ok": "2",
        "ko": "-"
    },
    "percentiles1": {
        "total": "4",
        "ok": "4",
        "ko": "-"
    },
    "percentiles2": {
        "total": "6",
        "ok": "6",
        "ko": "-"
    },
    "percentiles3": {
        "total": "9",
        "ok": "9",
        "ko": "-"
    },
    "percentiles4": {
        "total": "11",
        "ok": "11",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 200,
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
        "total": "33.333",
        "ok": "33.333",
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
