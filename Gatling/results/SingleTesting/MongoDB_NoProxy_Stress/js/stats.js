var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "360",
        "ok": "347",
        "ko": "13"
    },
    "minResponseTime": {
        "total": "2",
        "ok": "2",
        "ko": "15"
    },
    "maxResponseTime": {
        "total": "86",
        "ok": "86",
        "ko": "55"
    },
    "meanResponseTime": {
        "total": "12",
        "ok": "12",
        "ko": "21"
    },
    "standardDeviation": {
        "total": "10",
        "ok": "10",
        "ko": "10"
    },
    "percentiles1": {
        "total": "14",
        "ok": "5",
        "ko": "18"
    },
    "percentiles2": {
        "total": "19",
        "ok": "19",
        "ko": "19"
    },
    "percentiles3": {
        "total": "25",
        "ok": "24",
        "ko": "38"
    },
    "percentiles4": {
        "total": "33",
        "ok": "31",
        "ko": "52"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 347,
    "percentage": 96
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
    "count": 13,
    "percentage": 4
},
    "meanNumberOfRequestsPerSecond": {
        "total": "5.714",
        "ok": "5.508",
        "ko": "0.206"
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
        "total": "180",
        "ok": "167",
        "ko": "13"
    },
    "minResponseTime": {
        "total": "15",
        "ok": "15",
        "ko": "15"
    },
    "maxResponseTime": {
        "total": "86",
        "ok": "86",
        "ko": "55"
    },
    "meanResponseTime": {
        "total": "21",
        "ok": "20",
        "ko": "21"
    },
    "standardDeviation": {
        "total": "6",
        "ok": "6",
        "ko": "10"
    },
    "percentiles1": {
        "total": "19",
        "ok": "20",
        "ko": "18"
    },
    "percentiles2": {
        "total": "21",
        "ok": "21",
        "ko": "19"
    },
    "percentiles3": {
        "total": "26",
        "ok": "26",
        "ko": "38"
    },
    "percentiles4": {
        "total": "42",
        "ok": "35",
        "ko": "52"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 167,
    "percentage": 93
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
    "count": 13,
    "percentage": 7
},
    "meanNumberOfRequestsPerSecond": {
        "total": "2.857",
        "ok": "2.651",
        "ko": "0.206"
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
        "total": "180",
        "ok": "180",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "2",
        "ok": "2",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "12",
        "ok": "12",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "3",
        "ok": "3",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "1",
        "ok": "1",
        "ko": "-"
    },
    "percentiles1": {
        "total": "3",
        "ok": "3",
        "ko": "-"
    },
    "percentiles2": {
        "total": "4",
        "ok": "4",
        "ko": "-"
    },
    "percentiles3": {
        "total": "5",
        "ok": "5",
        "ko": "-"
    },
    "percentiles4": {
        "total": "6",
        "ok": "6",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 180,
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
        "total": "2.857",
        "ok": "2.857",
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
