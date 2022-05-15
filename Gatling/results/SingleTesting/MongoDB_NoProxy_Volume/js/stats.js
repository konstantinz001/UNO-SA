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
        "total": "1",
        "ok": "1",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "2089",
        "ok": "2089",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "421",
        "ok": "421",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "546",
        "ok": "546",
        "ko": "-"
    },
    "percentiles1": {
        "total": "77",
        "ok": "77",
        "ko": "-"
    },
    "percentiles2": {
        "total": "541",
        "ok": "541",
        "ko": "-"
    },
    "percentiles3": {
        "total": "1333",
        "ok": "1333",
        "ko": "-"
    },
    "percentiles4": {
        "total": "2033",
        "ok": "2033",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 301,
    "percentage": 75
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 40,
    "percentage": 10
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 59,
    "percentage": 15
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
        "total": "140",
        "ok": "140",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "2089",
        "ok": "2089",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "837",
        "ok": "837",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "499",
        "ok": "499",
        "ko": "-"
    },
    "percentiles1": {
        "total": "542",
        "ok": "542",
        "ko": "-"
    },
    "percentiles2": {
        "total": "1248",
        "ok": "1248",
        "ko": "-"
    },
    "percentiles3": {
        "total": "1421",
        "ok": "1421",
        "ko": "-"
    },
    "percentiles4": {
        "total": "2063",
        "ok": "2063",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 101,
    "percentage": 51
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 40,
    "percentage": 20
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 59,
    "percentage": 30
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
        "total": "1",
        "ok": "1",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "14",
        "ok": "14",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "4",
        "ok": "4",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "2",
        "ok": "2",
        "ko": "-"
    },
    "percentiles1": {
        "total": "3",
        "ok": "3",
        "ko": "-"
    },
    "percentiles2": {
        "total": "5",
        "ok": "5",
        "ko": "-"
    },
    "percentiles3": {
        "total": "8",
        "ok": "8",
        "ko": "-"
    },
    "percentiles4": {
        "total": "12",
        "ok": "12",
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
