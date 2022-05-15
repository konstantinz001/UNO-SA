var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "2000",
        "ok": "1259",
        "ko": "741"
    },
    "minResponseTime": {
        "total": "2",
        "ok": "2",
        "ko": "2025"
    },
    "maxResponseTime": {
        "total": "8132",
        "ok": "6944",
        "ko": "8132"
    },
    "meanResponseTime": {
        "total": "1526",
        "ok": "1075",
        "ko": "2292"
    },
    "standardDeviation": {
        "total": "956",
        "ok": "917",
        "ko": "323"
    },
    "percentiles1": {
        "total": "1811",
        "ok": "1096",
        "ko": "2255"
    },
    "percentiles2": {
        "total": "2241",
        "ok": "1732",
        "ko": "2346"
    },
    "percentiles3": {
        "total": "2513",
        "ok": "2653",
        "ko": "2464"
    },
    "percentiles4": {
        "total": "3479",
        "ok": "3280",
        "ko": "3633"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 569,
    "percentage": 28
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 125,
    "percentage": 6
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 565,
    "percentage": 28
},
    "group4": {
    "name": "failed",
    "count": 741,
    "percentage": 37
},
    "meanNumberOfRequestsPerSecond": {
        "total": "166.667",
        "ok": "104.917",
        "ko": "61.75"
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
        "ok": "259",
        "ko": "741"
    },
    "minResponseTime": {
        "total": "321",
        "ok": "321",
        "ko": "2025"
    },
    "maxResponseTime": {
        "total": "8132",
        "ok": "6944",
        "ko": "8132"
    },
    "meanResponseTime": {
        "total": "2195",
        "ok": "1918",
        "ko": "2292"
    },
    "standardDeviation": {
        "total": "611",
        "ok": "1019",
        "ko": "323"
    },
    "percentiles1": {
        "total": "2242",
        "ok": "1982",
        "ko": "2255"
    },
    "percentiles2": {
        "total": "2361",
        "ok": "2645",
        "ko": "2346"
    },
    "percentiles3": {
        "total": "3078",
        "ok": "3276",
        "ko": "2464"
    },
    "percentiles4": {
        "total": "3645",
        "ok": "3925",
        "ko": "3633"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 48,
    "percentage": 5
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 35,
    "percentage": 4
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 176,
    "percentage": 18
},
    "group4": {
    "name": "failed",
    "count": 741,
    "percentage": 74
},
    "meanNumberOfRequestsPerSecond": {
        "total": "83.333",
        "ok": "21.583",
        "ko": "61.75"
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
        "total": "2",
        "ok": "2",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "2153",
        "ok": "2153",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "857",
        "ok": "857",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "747",
        "ok": "747",
        "ko": "-"
    },
    "percentiles1": {
        "total": "768",
        "ok": "768",
        "ko": "-"
    },
    "percentiles2": {
        "total": "1619",
        "ok": "1619",
        "ko": "-"
    },
    "percentiles3": {
        "total": "2077",
        "ok": "2077",
        "ko": "-"
    },
    "percentiles4": {
        "total": "2139",
        "ok": "2139",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 521,
    "percentage": 52
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 90,
    "percentage": 9
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 389,
    "percentage": 39
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "83.333",
        "ok": "83.333",
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
