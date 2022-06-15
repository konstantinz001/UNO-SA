var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "720",
        "ok": "715",
        "ko": "5"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "38"
    },
    "maxResponseTime": {
        "total": "66",
        "ok": "66",
        "ko": "60"
    },
    "meanResponseTime": {
        "total": "20",
        "ok": "20",
        "ko": "52"
    },
    "standardDeviation": {
        "total": "19",
        "ok": "19",
        "ko": "8"
    },
    "percentiles1": {
        "total": "21",
        "ok": "11",
        "ko": "57"
    },
    "percentiles2": {
        "total": "36",
        "ok": "36",
        "ko": "58"
    },
    "percentiles3": {
        "total": "51",
        "ok": "51",
        "ko": "60"
    },
    "percentiles4": {
        "total": "57",
        "ok": "56",
        "ko": "60"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 715,
    "percentage": 99
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
    "count": 5,
    "percentage": 1
},
    "meanNumberOfRequestsPerSecond": {
        "total": "3.934",
        "ok": "3.907",
        "ko": "0.027"
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
        "total": "360",
        "ok": "355",
        "ko": "5"
    },
    "minResponseTime": {
        "total": "28",
        "ok": "28",
        "ko": "38"
    },
    "maxResponseTime": {
        "total": "66",
        "ok": "66",
        "ko": "60"
    },
    "meanResponseTime": {
        "total": "38",
        "ok": "38",
        "ko": "52"
    },
    "standardDeviation": {
        "total": "8",
        "ok": "8",
        "ko": "8"
    },
    "percentiles1": {
        "total": "36",
        "ok": "36",
        "ko": "57"
    },
    "percentiles2": {
        "total": "44",
        "ok": "43",
        "ko": "58"
    },
    "percentiles3": {
        "total": "54",
        "ok": "54",
        "ko": "60"
    },
    "percentiles4": {
        "total": "59",
        "ok": "58",
        "ko": "60"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 355,
    "percentage": 99
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
    "count": 5,
    "percentage": 1
},
    "meanNumberOfRequestsPerSecond": {
        "total": "1.967",
        "ok": "1.94",
        "ko": "0.027"
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
        "total": "360",
        "ok": "360",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "19",
        "ok": "19",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "2",
        "ok": "2",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "2",
        "ok": "2",
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
        "total": "4",
        "ok": "4",
        "ko": "-"
    },
    "percentiles4": {
        "total": "5",
        "ok": "5",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 360,
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
        "total": "1.967",
        "ok": "1.967",
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
