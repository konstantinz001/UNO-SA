var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "40064",
        "ok": "9394",
        "ko": "30670"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "26"
    },
    "maxResponseTime": {
        "total": "57779",
        "ok": "55546",
        "ko": "57779"
    },
    "meanResponseTime": {
        "total": "4605",
        "ok": "2997",
        "ko": "5097"
    },
    "standardDeviation": {
        "total": "5789",
        "ok": "8331",
        "ko": "4636"
    },
    "percentiles1": {
        "total": "3204",
        "ok": "29",
        "ko": "3548"
    },
    "percentiles2": {
        "total": "5104",
        "ok": "366",
        "ko": "5818"
    },
    "percentiles3": {
        "total": "14702",
        "ok": "17587",
        "ko": "14116"
    },
    "percentiles4": {
        "total": "36264",
        "ok": "42496",
        "ko": "19832"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 7224,
    "percentage": 18
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 75,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 2095,
    "percentage": 5
},
    "group4": {
    "name": "failed",
    "count": 30670,
    "percentage": 77
},
    "meanNumberOfRequestsPerSecond": {
        "total": "87.285",
        "ok": "20.466",
        "ko": "66.819"
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
        "ok": "3687",
        "ko": "16345"
    },
    "minResponseTime": {
        "total": "26",
        "ok": "26",
        "ko": "26"
    },
    "maxResponseTime": {
        "total": "57779",
        "ok": "55546",
        "ko": "57779"
    },
    "meanResponseTime": {
        "total": "5197",
        "ok": "5519",
        "ko": "5125"
    },
    "standardDeviation": {
        "total": "7099",
        "ok": "12037",
        "ko": "5390"
    },
    "percentiles1": {
        "total": "3154",
        "ok": "33",
        "ko": "3459"
    },
    "percentiles2": {
        "total": "5251",
        "ok": "2938",
        "ko": "5483"
    },
    "percentiles3": {
        "total": "16756",
        "ok": "36934",
        "ko": "15998"
    },
    "percentiles4": {
        "total": "40547",
        "ok": "47443",
        "ko": "31772"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 2501,
    "percentage": 12
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 26,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 1160,
    "percentage": 6
},
    "group4": {
    "name": "failed",
    "count": 16345,
    "percentage": 82
},
    "meanNumberOfRequestsPerSecond": {
        "total": "43.643",
        "ok": "8.033",
        "ko": "35.61"
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
        "ok": "5707",
        "ko": "14325"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "2000"
    },
    "maxResponseTime": {
        "total": "25091",
        "ok": "25091",
        "ko": "21679"
    },
    "meanResponseTime": {
        "total": "4013",
        "ok": "1368",
        "ko": "5066"
    },
    "standardDeviation": {
        "total": "3992",
        "ok": "3724",
        "ko": "3586"
    },
    "percentiles1": {
        "total": "3225",
        "ok": "3",
        "ko": "3629"
    },
    "percentiles2": {
        "total": "5000",
        "ok": "140",
        "ko": "6166"
    },
    "percentiles3": {
        "total": "12709",
        "ok": "11496",
        "ko": "13283"
    },
    "percentiles4": {
        "total": "18184",
        "ok": "17086",
        "ko": "18185"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 4723,
    "percentage": 24
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 49,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 935,
    "percentage": 5
},
    "group4": {
    "name": "failed",
    "count": 14325,
    "percentage": 72
},
    "meanNumberOfRequestsPerSecond": {
        "total": "43.643",
        "ok": "12.434",
        "ko": "31.209"
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
