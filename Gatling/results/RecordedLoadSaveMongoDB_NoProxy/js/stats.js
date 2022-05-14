var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "40064",
        "ok": "8543",
        "ko": "31521"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "11"
    },
    "maxResponseTime": {
        "total": "37092",
        "ok": "37092",
        "ko": "36999"
    },
    "meanResponseTime": {
        "total": "1955",
        "ok": "1417",
        "ko": "2101"
    },
    "standardDeviation": {
        "total": "2034",
        "ok": "3470",
        "ko": "1376"
    },
    "percentiles1": {
        "total": "2043",
        "ok": "14",
        "ko": "2045"
    },
    "percentiles2": {
        "total": "2060",
        "ok": "1590",
        "ko": "2062"
    },
    "percentiles3": {
        "total": "2505",
        "ok": "6888",
        "ko": "2374"
    },
    "percentiles4": {
        "total": "7508",
        "ok": "13438",
        "ko": "5485"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 5765,
    "percentage": 14
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 436,
    "percentage": 1
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 2342,
    "percentage": 6
},
    "group4": {
    "name": "failed",
    "count": 31521,
    "percentage": 79
},
    "meanNumberOfRequestsPerSecond": {
        "total": "98.196",
        "ok": "20.939",
        "ko": "77.257"
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
        "total": "20032",
        "ok": "2673",
        "ko": "17359"
    },
    "minResponseTime": {
        "total": "11",
        "ok": "11",
        "ko": "11"
    },
    "maxResponseTime": {
        "total": "37092",
        "ok": "37092",
        "ko": "36999"
    },
    "meanResponseTime": {
        "total": "2177",
        "ok": "2595",
        "ko": "2113"
    },
    "standardDeviation": {
        "total": "2628",
        "ok": "5412",
        "ko": "1852"
    },
    "percentiles1": {
        "total": "2043",
        "ok": "42",
        "ko": "2044"
    },
    "percentiles2": {
        "total": "2066",
        "ok": "2922",
        "ko": "2063"
    },
    "percentiles3": {
        "total": "3121",
        "ok": "8042",
        "ko": "2379"
    },
    "percentiles4": {
        "total": "8709",
        "ok": "32394",
        "ko": "7503"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1567,
    "percentage": 8
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 43,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 1063,
    "percentage": 5
},
    "group4": {
    "name": "failed",
    "count": 17359,
    "percentage": 87
},
    "meanNumberOfRequestsPerSecond": {
        "total": "49.098",
        "ok": "6.551",
        "ko": "42.547"
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
        "total": "20032",
        "ok": "5870",
        "ko": "14162"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "2001"
    },
    "maxResponseTime": {
        "total": "30967",
        "ok": "30967",
        "ko": "2905"
    },
    "meanResponseTime": {
        "total": "1733",
        "ok": "880",
        "ko": "2086"
    },
    "standardDeviation": {
        "total": "1125",
        "ok": "1807",
        "ko": "108"
    },
    "percentiles1": {
        "total": "2042",
        "ok": "4",
        "ko": "2046"
    },
    "percentiles2": {
        "total": "2057",
        "ok": "978",
        "ko": "2061"
    },
    "percentiles3": {
        "total": "2426",
        "ok": "5540",
        "ko": "2371"
    },
    "percentiles4": {
        "total": "6069",
        "ok": "7045",
        "ko": "2492"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 4198,
    "percentage": 21
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 393,
    "percentage": 2
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 1279,
    "percentage": 6
},
    "group4": {
    "name": "failed",
    "count": 14162,
    "percentage": 71
},
    "meanNumberOfRequestsPerSecond": {
        "total": "49.098",
        "ok": "14.387",
        "ko": "34.711"
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
