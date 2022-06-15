var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "720",
        "ok": "677",
        "ko": "43"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "15"
    },
    "maxResponseTime": {
        "total": "523",
        "ok": "523",
        "ko": "34"
    },
    "meanResponseTime": {
        "total": "12",
        "ok": "11",
        "ko": "18"
    },
    "standardDeviation": {
        "total": "22",
        "ok": "23",
        "ko": "4"
    },
    "percentiles1": {
        "total": "14",
        "ok": "4",
        "ko": "17"
    },
    "percentiles2": {
        "total": "18",
        "ok": "18",
        "ko": "18"
    },
    "percentiles3": {
        "total": "24",
        "ok": "24",
        "ko": "25"
    },
    "percentiles4": {
        "total": "31",
        "ok": "30",
        "ko": "33"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 677,
    "percentage": 94
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
    "count": 43,
    "percentage": 6
},
    "meanNumberOfRequestsPerSecond": {
        "total": "3.934",
        "ok": "3.699",
        "ko": "0.235"
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
        "ok": "317",
        "ko": "43"
    },
    "minResponseTime": {
        "total": "14",
        "ok": "14",
        "ko": "15"
    },
    "maxResponseTime": {
        "total": "523",
        "ok": "523",
        "ko": "34"
    },
    "meanResponseTime": {
        "total": "20",
        "ok": "20",
        "ko": "18"
    },
    "standardDeviation": {
        "total": "27",
        "ok": "28",
        "ko": "4"
    },
    "percentiles1": {
        "total": "18",
        "ok": "18",
        "ko": "17"
    },
    "percentiles2": {
        "total": "20",
        "ok": "20",
        "ko": "18"
    },
    "percentiles3": {
        "total": "25",
        "ok": "25",
        "ko": "25"
    },
    "percentiles4": {
        "total": "31",
        "ok": "31",
        "ko": "33"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 317,
    "percentage": 88
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
    "count": 43,
    "percentage": 12
},
    "meanNumberOfRequestsPerSecond": {
        "total": "1.967",
        "ok": "1.732",
        "ko": "0.235"
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
        "total": "171",
        "ok": "171",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "4",
        "ok": "4",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "13",
        "ok": "13",
        "ko": "-"
    },
    "percentiles1": {
        "total": "3",
        "ok": "3",
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
        "total": "6",
        "ok": "6",
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
