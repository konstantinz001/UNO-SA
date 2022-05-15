var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "3600",
        "ok": "2976",
        "ko": "624"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "27"
    },
    "maxResponseTime": {
        "total": "9987",
        "ok": "9971",
        "ko": "9987"
    },
    "meanResponseTime": {
        "total": "336",
        "ok": "212",
        "ko": "925"
    },
    "standardDeviation": {
        "total": "1323",
        "ok": "1052",
        "ko": "2099"
    },
    "percentiles1": {
        "total": "29",
        "ok": "4",
        "ko": "35"
    },
    "percentiles2": {
        "total": "33",
        "ok": "31",
        "ko": "254"
    },
    "percentiles3": {
        "total": "1827",
        "ok": "610",
        "ko": "6232"
    },
    "percentiles4": {
        "total": "8116",
        "ok": "7673",
        "ko": "9471"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 2844,
    "percentage": 79
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 21,
    "percentage": 1
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 111,
    "percentage": 3
},
    "group4": {
    "name": "failed",
    "count": 624,
    "percentage": 17
},
    "meanNumberOfRequestsPerSecond": {
        "total": "18.848",
        "ok": "15.581",
        "ko": "3.267"
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
        "ok": "1176",
        "ko": "624"
    },
    "minResponseTime": {
        "total": "26",
        "ok": "26",
        "ko": "27"
    },
    "maxResponseTime": {
        "total": "9987",
        "ok": "9971",
        "ko": "9987"
    },
    "meanResponseTime": {
        "total": "625",
        "ok": "466",
        "ko": "925"
    },
    "standardDeviation": {
        "total": "1808",
        "ok": "1610",
        "ko": "2099"
    },
    "percentiles1": {
        "total": "32",
        "ok": "31",
        "ko": "35"
    },
    "percentiles2": {
        "total": "43",
        "ok": "38",
        "ko": "254"
    },
    "percentiles3": {
        "total": "5420",
        "ok": "3922",
        "ko": "6232"
    },
    "percentiles4": {
        "total": "8934",
        "ok": "8541",
        "ko": "9471"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1076,
    "percentage": 60
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 12,
    "percentage": 1
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 88,
    "percentage": 5
},
    "group4": {
    "name": "failed",
    "count": 624,
    "percentage": 35
},
    "meanNumberOfRequestsPerSecond": {
        "total": "9.424",
        "ok": "6.157",
        "ko": "3.267"
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
        "total": "3369",
        "ok": "3369",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "47",
        "ok": "47",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "256",
        "ok": "256",
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
        "total": "118",
        "ok": "118",
        "ko": "-"
    },
    "percentiles4": {
        "total": "1406",
        "ok": "1406",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1768,
    "percentage": 98
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 9,
    "percentage": 1
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 23,
    "percentage": 1
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "9.424",
        "ok": "9.424",
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
