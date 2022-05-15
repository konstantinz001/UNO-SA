var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "720",
        "ok": "670",
        "ko": "50"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "14"
    },
    "maxResponseTime": {
        "total": "521",
        "ok": "261",
        "ko": "521"
    },
    "meanResponseTime": {
        "total": "12",
        "ok": "11",
        "ko": "31"
    },
    "standardDeviation": {
        "total": "23",
        "ok": "14",
        "ko": "70"
    },
    "percentiles1": {
        "total": "12",
        "ok": "4",
        "ko": "19"
    },
    "percentiles2": {
        "total": "18",
        "ok": "17",
        "ko": "23"
    },
    "percentiles3": {
        "total": "23",
        "ok": "22",
        "ko": "39"
    },
    "percentiles4": {
        "total": "43",
        "ok": "36",
        "ko": "289"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 670,
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
    "count": 50,
    "percentage": 7
},
    "meanNumberOfRequestsPerSecond": {
        "total": "3.934",
        "ok": "3.661",
        "ko": "0.273"
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
        "ok": "310",
        "ko": "50"
    },
    "minResponseTime": {
        "total": "14",
        "ok": "14",
        "ko": "14"
    },
    "maxResponseTime": {
        "total": "521",
        "ok": "261",
        "ko": "521"
    },
    "meanResponseTime": {
        "total": "21",
        "ok": "20",
        "ko": "31"
    },
    "standardDeviation": {
        "total": "30",
        "ok": "15",
        "ko": "70"
    },
    "percentiles1": {
        "total": "18",
        "ok": "18",
        "ko": "19"
    },
    "percentiles2": {
        "total": "20",
        "ok": "20",
        "ko": "23"
    },
    "percentiles3": {
        "total": "26",
        "ok": "25",
        "ko": "39"
    },
    "percentiles4": {
        "total": "46",
        "ok": "43",
        "ko": "289"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 310,
    "percentage": 86
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
    "count": 50,
    "percentage": 14
},
    "meanNumberOfRequestsPerSecond": {
        "total": "1.967",
        "ok": "1.694",
        "ko": "0.273"
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
        "total": "92",
        "ok": "92",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "3",
        "ok": "3",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "7",
        "ok": "7",
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
