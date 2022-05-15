var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "1890",
        "ok": "1868",
        "ko": "22"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "27"
    },
    "maxResponseTime": {
        "total": "6219",
        "ok": "1760",
        "ko": "6219"
    },
    "meanResponseTime": {
        "total": "231",
        "ok": "213",
        "ko": "1757"
    },
    "standardDeviation": {
        "total": "526",
        "ok": "441",
        "ko": "2224"
    },
    "percentiles1": {
        "total": "18",
        "ok": "5",
        "ko": "45"
    },
    "percentiles2": {
        "total": "47",
        "ok": "46",
        "ko": "3629"
    },
    "percentiles3": {
        "total": "1444",
        "ok": "1402",
        "ko": "5690"
    },
    "percentiles4": {
        "total": "1706",
        "ok": "1692",
        "ko": "6113"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1640,
    "percentage": 87
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 88,
    "percentage": 5
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 140,
    "percentage": 7
},
    "group4": {
    "name": "failed",
    "count": 22,
    "percentage": 1
},
    "meanNumberOfRequestsPerSecond": {
        "total": "7.269",
        "ok": "7.185",
        "ko": "0.085"
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
        "total": "945",
        "ok": "923",
        "ko": "22"
    },
    "minResponseTime": {
        "total": "25",
        "ok": "25",
        "ko": "27"
    },
    "maxResponseTime": {
        "total": "6219",
        "ok": "1760",
        "ko": "6219"
    },
    "meanResponseTime": {
        "total": "460",
        "ok": "429",
        "ko": "1757"
    },
    "standardDeviation": {
        "total": "670",
        "ok": "548",
        "ko": "2224"
    },
    "percentiles1": {
        "total": "48",
        "ok": "48",
        "ko": "45"
    },
    "percentiles2": {
        "total": "810",
        "ok": "789",
        "ko": "3629"
    },
    "percentiles3": {
        "total": "1618",
        "ok": "1593",
        "ko": "5690"
    },
    "percentiles4": {
        "total": "1742",
        "ok": "1707",
        "ko": "6113"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 695,
    "percentage": 74
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 88,
    "percentage": 9
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 140,
    "percentage": 15
},
    "group4": {
    "name": "failed",
    "count": 22,
    "percentage": 2
},
    "meanNumberOfRequestsPerSecond": {
        "total": "3.635",
        "ok": "3.55",
        "ko": "0.085"
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
        "total": "945",
        "ok": "945",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "11",
        "ok": "11",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "2",
        "ok": "2",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "1",
        "ok": "1",
        "ko": "-"
    },
    "percentiles1": {
        "total": "2",
        "ok": "2",
        "ko": "-"
    },
    "percentiles2": {
        "total": "2",
        "ok": "2",
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
    "count": 945,
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
        "total": "3.635",
        "ok": "3.635",
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
