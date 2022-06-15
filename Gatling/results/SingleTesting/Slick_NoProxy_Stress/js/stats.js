var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "360",
        "ok": "346",
        "ko": "14"
    },
    "minResponseTime": {
        "total": "2",
        "ok": "2",
        "ko": "31"
    },
    "maxResponseTime": {
        "total": "57",
        "ok": "57",
        "ko": "51"
    },
    "meanResponseTime": {
        "total": "21",
        "ok": "20",
        "ko": "39"
    },
    "standardDeviation": {
        "total": "18",
        "ok": "18",
        "ko": "6"
    },
    "percentiles1": {
        "total": "14",
        "ok": "6",
        "ko": "39"
    },
    "percentiles2": {
        "total": "35",
        "ok": "34",
        "ko": "45"
    },
    "percentiles3": {
        "total": "52",
        "ok": "53",
        "ko": "49"
    },
    "percentiles4": {
        "total": "57",
        "ok": "57",
        "ko": "51"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 346,
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
    "count": 14,
    "percentage": 4
},
    "meanNumberOfRequestsPerSecond": {
        "total": "5.714",
        "ok": "5.492",
        "ko": "0.222"
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
        "ok": "166",
        "ko": "14"
    },
    "minResponseTime": {
        "total": "29",
        "ok": "29",
        "ko": "31"
    },
    "maxResponseTime": {
        "total": "57",
        "ok": "57",
        "ko": "51"
    },
    "meanResponseTime": {
        "total": "39",
        "ok": "39",
        "ko": "39"
    },
    "standardDeviation": {
        "total": "8",
        "ok": "9",
        "ko": "6"
    },
    "percentiles1": {
        "total": "35",
        "ok": "35",
        "ko": "39"
    },
    "percentiles2": {
        "total": "45",
        "ok": "45",
        "ko": "45"
    },
    "percentiles3": {
        "total": "56",
        "ok": "56",
        "ko": "49"
    },
    "percentiles4": {
        "total": "57",
        "ok": "57",
        "ko": "51"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 166,
    "percentage": 92
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
    "count": 14,
    "percentage": 8
},
    "meanNumberOfRequestsPerSecond": {
        "total": "2.857",
        "ok": "2.635",
        "ko": "0.222"
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
        "total": "6",
        "ok": "6",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "4",
        "ok": "4",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "1",
        "ok": "1",
        "ko": "-"
    },
    "percentiles1": {
        "total": "4",
        "ok": "4",
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
