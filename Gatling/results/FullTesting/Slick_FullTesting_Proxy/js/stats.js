var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "1890",
        "ok": "1863",
        "ko": "27"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "28"
    },
    "maxResponseTime": {
        "total": "7082",
        "ok": "5645",
        "ko": "7082"
    },
    "meanResponseTime": {
        "total": "241",
        "ok": "218",
        "ko": "1844"
    },
    "standardDeviation": {
        "total": "566",
        "ok": "458",
        "ko": "2319"
    },
    "percentiles1": {
        "total": "20",
        "ok": "6",
        "ko": "201"
    },
    "percentiles2": {
        "total": "50",
        "ok": "49",
        "ko": "3433"
    },
    "percentiles3": {
        "total": "1424",
        "ok": "1373",
        "ko": "6441"
    },
    "percentiles4": {
        "total": "1725",
        "ok": "1642",
        "ko": "6954"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1621,
    "percentage": 86
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 102,
    "percentage": 5
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 140,
    "percentage": 7
},
    "group4": {
    "name": "failed",
    "count": 27,
    "percentage": 1
},
    "meanNumberOfRequestsPerSecond": {
        "total": "7.269",
        "ok": "7.165",
        "ko": "0.104"
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
        "ok": "918",
        "ko": "27"
    },
    "minResponseTime": {
        "total": "26",
        "ok": "26",
        "ko": "28"
    },
    "maxResponseTime": {
        "total": "7082",
        "ok": "5645",
        "ko": "7082"
    },
    "meanResponseTime": {
        "total": "479",
        "ok": "439",
        "ko": "1844"
    },
    "standardDeviation": {
        "total": "726",
        "ok": "573",
        "ko": "2319"
    },
    "percentiles1": {
        "total": "50",
        "ok": "50",
        "ko": "201"
    },
    "percentiles2": {
        "total": "863",
        "ok": "852",
        "ko": "3433"
    },
    "percentiles3": {
        "total": "1604",
        "ok": "1557",
        "ko": "6441"
    },
    "percentiles4": {
        "total": "2468",
        "ok": "1724",
        "ko": "6954"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 676,
    "percentage": 72
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 102,
    "percentage": 11
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 140,
    "percentage": 15
},
    "group4": {
    "name": "failed",
    "count": 27,
    "percentage": 3
},
    "meanNumberOfRequestsPerSecond": {
        "total": "3.635",
        "ok": "3.531",
        "ko": "0.104"
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
        "total": "13",
        "ok": "13",
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
        "total": "8",
        "ok": "8",
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
